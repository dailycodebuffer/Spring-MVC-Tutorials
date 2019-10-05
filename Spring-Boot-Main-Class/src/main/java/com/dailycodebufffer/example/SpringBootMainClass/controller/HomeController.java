package com.dailycodebufffer.example.SpringBootMainClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public String goToHomePage () {
        return "<h1>This is the Home page</h1>";
    }

}
