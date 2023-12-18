package com.keshe.backend.service;

import com.keshe.backend.pojo.User;

import java.util.List;

public interface UserService {
    User register(User user);

    User login(User user);

    List<User> list();
}
