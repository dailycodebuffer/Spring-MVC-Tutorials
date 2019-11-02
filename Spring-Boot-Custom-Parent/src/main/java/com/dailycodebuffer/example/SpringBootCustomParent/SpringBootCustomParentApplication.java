package com.dailycodebuffer.example.SpringBootCustomParent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringBootCustomParentApplication {

	private static Logger log = LoggerFactory.getLogger(SpringBootCustomParentApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomParentApplication.class, args);
	}

	@PostConstruct
	private void init(){
		log.info("creating an executable jar/war with spring boot without parent pom");
	}
}
