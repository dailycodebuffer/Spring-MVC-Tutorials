package com.dailycodebuffer.eurekaclientapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientAppApplication.class, args);
	}

}
