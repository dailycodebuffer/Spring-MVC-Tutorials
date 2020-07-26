package com.dailycodebuffer;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition
public class OpenapiDocumentationApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiDocumentationApplication.class, args);
	}

}
