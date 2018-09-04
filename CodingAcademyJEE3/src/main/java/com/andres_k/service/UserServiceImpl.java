package com.andres_k.service;

import com.andres_k.dao.UserDAO;
import com.andres_k.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    public User register(User user) {
        userDAO.save(user);
        return user;
    }

    public User logUser(String username, String password) {

        return null;
    }

    public List<User> getAll() {
        return userDAO.getAll();
    }

    public User getById(Integer id) {
        return userDAO.getById(id);
    }
}
