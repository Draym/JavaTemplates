package com.andres_k.dao;

import com.andres_k.model.User;

import java.util.List;

public interface UserDAO {

    void save(User user);
    void update(User user);
    void delete(User user);

    User getById(Integer id);
    List<User> getAll();
}
