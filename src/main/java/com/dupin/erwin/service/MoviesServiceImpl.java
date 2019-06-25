package com.dupin.erwin.service;

import com.dupin.erwin.model.Movies;
import com.dupin.erwin.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    MovieRepository movieRepository;


    public Iterable findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return movieRepository.findById(id);
    }

    public Movies findByTitle(String title){ return movieRepository.findByMovieTitle(title);}

    @Override
    public void deleteById(Long id) {
         movieRepository.deleteById(id);
    }

    public Movies addMovie(Movies movie){
        return movieRepository.save(movie);
    }

    public void deleteMovie(Movies movie){
        movieRepository.delete(movie);
    }

}
