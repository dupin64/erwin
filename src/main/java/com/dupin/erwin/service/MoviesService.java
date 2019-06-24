package com.dupin.erwin.service;

import com.dupin.erwin.model.Movies;
import com.dupin.erwin.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MoviesService {



    public Iterable<Movies> findAll();

    public Optional findById(Long id);


}
