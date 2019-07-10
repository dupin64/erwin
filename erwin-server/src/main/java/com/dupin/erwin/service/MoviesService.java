package com.dupin.erwin.service;

import com.dupin.erwin.model.Movies;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface MoviesService {



    public Iterable<Movies> findAll();

    public Optional findById(Long id);

    public void deleteById(Long id);






}
