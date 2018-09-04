package com.andres_k.service;

import com.andres_k.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    private HashMap<String, User> table;

    public UserServiceImpl() {
        this.table = new HashMap<>();
    }

    public User register(User user) {
        if (!table.containsKey(user.getName())) {
            table.put(user.getName(), user);
            return user;
        }
        return null;
    }

    public User logUser(String username, String password) {
        if (table.containsKey(username)) {
            User user = table.get(username);
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public List<User> getAll() {
        return new ArrayList<User>(table.values());
    }

    public User getById(Integer id) {
        for (Map.Entry<String, User> entry : table.entrySet()) {
            if (entry.getValue().getId() == id) {
                return entry.getValue();
            }
        }
        return null;
    }
}
