package com.dailycodebuffer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class Initializer implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        Stream.of("Shabbir", "Rahul", "Nikhil",
                "Shivam").forEach(name ->
                userRepository.save(new User(name))
        );

    }
}
