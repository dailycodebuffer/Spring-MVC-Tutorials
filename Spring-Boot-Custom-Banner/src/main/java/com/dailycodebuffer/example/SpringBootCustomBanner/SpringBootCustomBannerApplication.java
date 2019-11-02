package com.dailycodebuffer.example.SpringBootCustomBanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootCustomBannerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCustomBannerApplication.class, args);
		/*SpringApplication application = new SpringApplication(SpringBootCustomBannerApplication.class);
		application.setBanner(new MyCustomBanner());
		application.run(args);*/
	}

}
