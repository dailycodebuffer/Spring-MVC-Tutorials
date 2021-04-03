package com.dailycodebuffer.springregistryserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringRegistryServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRegistryServerApplication.class, args);
	}

}
