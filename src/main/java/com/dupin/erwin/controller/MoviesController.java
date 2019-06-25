package com.dupin.erwin.controller;

import com.dupin.erwin.model.Movies;
import com.dupin.erwin.service.MoviesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class MoviesController {

    @Autowired
    MoviesServiceImpl moviesService;

    @RequestMapping("/profile/movies")
    public Iterable<Movies> getAllMovies(){
        return moviesService.findAll();
    }

    @RequestMapping("/profiles/movies/{id}")
    public Optional getMovie(@RequestParam("id")Long id){
        return moviesService.findById(id);
    }

    @RequestMapping("/profiles/movies/{title}")
    public Movies getMovieByTitle(@RequestParam("title") String title){
        return moviesService.findByTitle(title);
    }

    @DeleteMapping("/profiles/movies/{id}")
    public void deleteMovie(@PathVariable long id){
         moviesService.deleteById(id);
    }

    @PostMapping("/profiles/movies")
    public Movies addMovie(@RequestBody Movies movie){
        return moviesService.addMovie(movie);
    }
}
