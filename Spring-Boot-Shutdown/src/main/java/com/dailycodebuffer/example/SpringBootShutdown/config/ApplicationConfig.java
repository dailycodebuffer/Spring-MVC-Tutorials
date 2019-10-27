package com.dailycodebuffer.example.SpringBootShutdown.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PreDestroy;

@Configuration
public class ApplicationConfig {

    @PreDestroy
    public void onShutDown() {
        System.out.println("closing application context..let's do the final resource cleanup");
    }
}
