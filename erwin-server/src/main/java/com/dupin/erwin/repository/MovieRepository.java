package com.dupin.erwin.repository;

import com.dupin.erwin.model.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Long> {

    Movies findByMovieTitle(String title);
    void deleteById(Long id);


}
