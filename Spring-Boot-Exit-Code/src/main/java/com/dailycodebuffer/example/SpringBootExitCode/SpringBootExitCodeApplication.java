package com.dailycodebuffer.example.SpringBootExitCode;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringBootExitCodeApplication implements ExitCodeGenerator {

	public static void main(String[] args) {
		System.exit(SpringApplication
				.exit(SpringApplication.run(SpringBootExitCodeApplication.class, args)));
	}

	@Override
	public int getExitCode() {
		return 33;
	}

	@Bean
	ExitCodeExceptionMapper exitCodeToexceptionMapper() {
		return exception -> {

			if (exception.getCause() instanceof NumberFormatException) {
				return 34;
			}
			if (exception.getCause() instanceof NullPointerException) {
				return 45;
			}
			return 1;
		};
	}

	@Bean
	CommandLineRunner createException() {
		return args -> Integer.parseInt("test") ;
	}

	@Bean
	SampleEventListener sampleEventListener() {
		return new SampleEventListener();
	}

	private static class SampleEventListener {

		@EventListener
		public void exitEvent(ExitCodeEvent event) {
			System.out.println("Application Exit code: " + event.getExitCode());
		}
	}
}
