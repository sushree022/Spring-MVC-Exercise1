package com.stackroute.controller;

import com.stackroute.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @RequestMapping("/")
    public ModelAndView sendMessage() {
        User user= new User();
        user.setUserName("Sushree");
        ModelAndView modelAndView= new ModelAndView("index");
        modelAndView.addObject("message",user.getUserName()+" Welcome to Stackroute");
        return modelAndView;
    }
}