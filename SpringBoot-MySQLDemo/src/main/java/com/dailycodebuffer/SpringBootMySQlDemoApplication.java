package com.dailycodebuffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringBootMySQlDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMySQlDemoApplication.class, args);
	}

}
