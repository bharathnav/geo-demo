package com.geo.demo.service;

import com.geo.demo.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
