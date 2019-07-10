package com.dupin.erwin.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "movies_shelf")
public class MovieShelf {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "shelf_name")
    private String shelfName;

    @OneToMany
    private List<Movies> movies;

    public MovieShelf(String shelfName, List<Movies> movies) {
        this.shelfName = shelfName;
        this.movies = movies;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }

    public List<Movies> getMovies() {
        return movies;
    }

    public void setMovies(List<Movies> movies) {
        this.movies = movies;
    }
}
