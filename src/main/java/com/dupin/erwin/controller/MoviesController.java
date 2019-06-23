package com.dupin.erwin.controller;

import com.dupin.erwin.model.Movies;
import com.dupin.erwin.service.MoviesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class MoviesController {

    @Autowired
    MoviesServiceImpl moviesService;

    @RequestMapping("/profile/movies/")
    public Iterable<Movies> getAllMovies(){
        return moviesService.findAll();
    }

    @RequestMapping("/profiles/movies/{id}")
    public Optional getMovies(@RequestParam("id")Long id){
        return moviesService.findById(id);
    }
}
