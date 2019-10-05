package com.dailycodebuffer.example.SpringBootErrorHandle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String homePage (Model model) {
        model.addAttribute("msg","This is Spring Boot Error Handle Example");
        return "homePage";
    }

    @RequestMapping("/test")
    public  void handlerTest () {
        throw new RuntimeException("exception from handlerTest");
    }

}
