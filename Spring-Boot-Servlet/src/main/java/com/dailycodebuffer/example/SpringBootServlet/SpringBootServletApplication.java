package com.dailycodebuffer.example.SpringBootServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootServletApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(SpringBootServletApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(SpringBootServletApplication.class);
	}

	@RestController
	public static class SpringBootServletController {

		@GetMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
		public String handler() {
			return "Hello there";
		}
	}

}
