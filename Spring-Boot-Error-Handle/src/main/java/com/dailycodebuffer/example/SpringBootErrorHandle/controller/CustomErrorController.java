package com.dailycodebuffer.example.SpringBootErrorHandle.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {

    private static final String PATH = "/error";

    @RequestMapping(value = PATH)
    public String error() {
        return "customError";
    }

    @Override
    public String getErrorPath() {
        return PATH;
    }

}
