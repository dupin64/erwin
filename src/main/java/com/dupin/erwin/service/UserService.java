package com.dupin.erwin.service;

import com.dupin.erwin.model.User;

public interface UserService {
    void save(User user );

    User findByUsername(String username);
}
