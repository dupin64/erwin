package com.dupin.erwin.payload;

public class UserProfile {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private Long movieCount;

    public UserProfile(Long id, String username, String firstName, String lastName, Long movieCount) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.movieCount = movieCount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getMovieCount() {
        return movieCount;
    }

    public void setMovieCount(Long movieCount) {
        this.movieCount = movieCount;
    }
}
