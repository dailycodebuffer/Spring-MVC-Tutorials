package com.dailycodebuffer.skaffold;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/main")
    public String main() {
        return "This app is deployed using Skaffold Dev!!!";
    }
}
