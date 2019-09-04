package com.dailycodebuffer.examples.springboothttpconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SpringBootHttpConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHttpConverterApplication.class, args);
	}

}
