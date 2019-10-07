package com.dailycodebufffer.example.SpringBootMainClass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilterExampleController {

    @GetMapping(value = "/filterExample")
    public String customGreetings() {
        return "Hello From Custom Filter Example";
    }
}
