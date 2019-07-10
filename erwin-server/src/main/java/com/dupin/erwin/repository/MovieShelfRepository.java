package com.dupin.erwin.repository;

import com.dupin.erwin.model.MovieShelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieShelfRepository extends JpaRepository<MovieShelf, Long> {

    MovieShelf findByMovieShelfId(Long id);
}