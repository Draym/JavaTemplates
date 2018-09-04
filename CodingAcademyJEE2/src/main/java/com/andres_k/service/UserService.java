package com.andres_k.service;

import com.andres_k.model.User;

import java.util.List;

public interface UserService {
    User register(User user);
    User logUser(String username, String password);
    User getById(Integer Id);
    List<User> getAll();
}
