package com.dailycodebuffer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/user")
    public String createUser(@RequestBody User user) {
        userRepository.save(user);
        return "User Added Successfully!!";
    }

    @GetMapping("/user")
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
}
