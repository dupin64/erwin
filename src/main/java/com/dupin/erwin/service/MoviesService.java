package com.dupin.erwin.service;

import com.dupin.erwin.model.Movies;

import java.util.Optional;

public interface MoviesService {
    public Iterable findAll();

    public Optional findById(Long id);
}
