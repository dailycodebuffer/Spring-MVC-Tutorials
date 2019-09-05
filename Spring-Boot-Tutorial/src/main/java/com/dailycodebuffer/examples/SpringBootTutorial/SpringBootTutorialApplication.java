package com.dailycodebuffer.examples.SpringBootTutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.dailycodebuffer.examples.SpringBootTutorial.repository")
@EntityScan("com.dailycodebuffer.examples.SpringBootTutorial.entity")
@SpringBootApplication
public class SpringBootTutorialApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootTutorialApplication.class, args);
	}

}
