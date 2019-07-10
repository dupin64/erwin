package com.dupin.erwin.controller;

import com.dupin.erwin.exception.ResourceNotFoundException;
import com.dupin.erwin.model.Movies;
import com.dupin.erwin.service.MoviesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MoviesController {

    @Autowired
    MoviesServiceImpl moviesService;

    @GetMapping("/profiles/movies")
    public Iterable<Movies> getAllMovies(){
        return moviesService.findAll();
    }

    @GetMapping("/profiles/movies/{id}")
    public Object getMovieById(@PathVariable(value = "id") Long movieId) throws Throwable {

        return moviesService.findById(movieId)
                .orElseThrow(() -> new ResourceNotFoundException("Movie", "id", movieId ));
    }

    @GetMapping("/profiles/movies/{title}")
    public Movies getMovieByTitle(@PathVariable String title){
        return moviesService.findByTitle(title);
    }

/*    @DeleteMapping("/profiles/movies/{id}")
    public void deleteMovie(@PathVariable Long id){
         moviesService.deleteById(id);
    }*/

    @DeleteMapping("/profiles/movies/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable Long id) throws Throwable {
        Movies movie = (Movies) moviesService.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException("Movie", "id", id));

        moviesService.deleteMovie(movie);

        return ResponseEntity.ok().build();

    }

    @PostMapping("/profiles/movies")
    public Movies addMovie(@RequestBody Movies movie){
        return moviesService.addMovie(movie);
    }

    @PutMapping("/profiles/movies/{id}")
    public Movies updateMovie(@PathVariable Long id,
                              @Valid @RequestBody Movies movieUpade) throws Throwable {
        Movies movie = (Movies) moviesService.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Movie", "id", id));

        movie.setMovieTitle(movieUpade.getMovieTitle());
        movie.setYearOfRelease(movieUpade.getYearOfRelease());

        Movies updatedMovie = moviesService.addMovie(movie);

        return updatedMovie;
    }
}
