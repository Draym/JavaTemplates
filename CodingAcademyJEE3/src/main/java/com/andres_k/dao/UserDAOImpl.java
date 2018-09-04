package com.andres_k.dao;

import com.andres_k.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO {

    @Override
    public void save(User user) {
        HibernateUtils.getActiveCurrentSession().save(user);
    }

    @Override
    public void update(User user) {
        HibernateUtils.getActiveCurrentSession().update(user);
    }

    @Override
    public void delete(User user) {
        HibernateUtils.getActiveCurrentSession().delete(user);
    }

    @Override
    public User getById(Integer id) {
        return (User)HibernateUtils.getActiveCurrentSession().get(User.class, id);
    }

    @Override
    public List<User> getAll() {
        return (List<User>)HibernateUtils.getActiveCurrentSession().createQuery("from User ").list();
    }
}
