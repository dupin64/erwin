package com.dupin.erwin.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class SignUpRequest {
    @NotBlank
    @Size(min = 3, max = 23)
    private String firstName;

    @NotBlank
    @Size(min = 3, max = 23)
    private String lasttName;

    @NotBlank
    @Size(min = 5, max = 17)
    private String username;

    @NotBlank
    @Size(max = 37)
    private String email;

    @NotBlank
    @Size(min = 7, max = 31)
    private String password;

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

    public String getLasttName() {
        return lasttName;
    }

    public void setLasttName(String lasttName) {
        this.lasttName = lasttName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
