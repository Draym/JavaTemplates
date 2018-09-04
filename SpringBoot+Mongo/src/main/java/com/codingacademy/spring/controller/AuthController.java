package com.codingacademy.spring.controller;

import com.codingacademy.spring.dao.MongoDB;
import org.bson.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping(value="/login", method= RequestMethod.GET)
    public void login() {
    }

    @RequestMapping(value="/register", method= RequestMethod.POST)
    public void register() {
        //Document doc = new Document("username", user.getUsername()).append("email", user.getEmail()).append("password", user.getPassword());

        Document doc = new Document("username", "tutu").append("email", "tutu@gmail.com").append("password", "azerty");
        MongoDB.getInstance().getCollection("users").insertOne(doc);
    }
}
