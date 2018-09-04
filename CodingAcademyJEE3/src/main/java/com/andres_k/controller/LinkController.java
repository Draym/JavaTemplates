package com.andres_k.controller;

import com.andres_k.model.User;
import com.andres_k.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class LinkController {

    @Autowired
    UserService userService;

    @RequestMapping(value ="/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value ="/hi", method = RequestMethod.GET)
    public String welcome(ModelMap model) {

        List<User> users = userService.getAll();

        model.addAttribute("message", "Hi who are you ?");
        model.addAttribute("users", users);
        return "hello";
    }
}
