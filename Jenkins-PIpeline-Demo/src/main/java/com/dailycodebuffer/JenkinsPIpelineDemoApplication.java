package com.dailycodebuffer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories("com.dailycodebuffer")
@EntityScan("com.dailycodebuffer")
@SpringBootApplication
public class JenkinsPIpelineDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsPIpelineDemoApplication.class, args);
	}

}
