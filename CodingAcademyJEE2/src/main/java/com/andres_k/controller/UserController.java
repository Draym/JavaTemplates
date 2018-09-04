package com.andres_k.controller;

import com.andres_k.model.User;
import com.andres_k.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/userForm", method = RequestMethod.GET)
    public ModelAndView userForm() {
        return new ModelAndView("userForm", "command", new User());
    }

    @RequestMapping(value="/users", method = RequestMethod.POST)
    public String addUser(User user, ModelMap model) {

        /* Use service here */
        userService.register(user);

        /* Create a message for the frond */
        model.addAttribute("name", user.getName());
        model.addAttribute("email", user.getEmail());
        model.addAttribute("age", user.getAge());
        model.addAttribute("location", user.getLocation());
        return "userInfo";
    }
}
