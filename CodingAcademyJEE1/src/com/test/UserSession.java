package com.test;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class UserSession {

    public UserSession() {
    }

    public String welcomeUser(User user) {
        return user.getGender() + " " + user.getName() + " want us to " + user.getAction() + (user.getGender().contains("M") ? " his " : " her ") + user.getAnimalId();
    }
}
