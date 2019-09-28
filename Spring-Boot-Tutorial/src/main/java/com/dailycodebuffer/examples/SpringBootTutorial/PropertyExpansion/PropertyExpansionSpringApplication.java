package com.dailycodebuffer.examples.SpringBootTutorial.PropertyExpansion;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PropertyExpansionSpringApplication {

    @Bean
    CustomBean customBean() {
        return new CustomBean();
    }

    public static void main(String[] args) throws InterruptedException {
        SpringApplication bootApp = new SpringApplication(PropertyExpansionSpringApplication.class);
        bootApp.setBannerMode(Banner.Mode.OFF);
        ConfigurableApplicationContext context = bootApp.run(args);
        CustomBean customBean = context.getBean(CustomBean.class);
        customBean.doSomething();
    }

    private static class CustomBean {

        @Value("${project-name}")
        private String projectName;

        @Value("${spring-version}")
        private String springVersion;

        @Value("${app-title}")
        private String appTitle;

        public void doSomething() {
            System.out.printf("Project name: %s%n"
                            + "Spring version: %s%n"
                            + "App title: %s%n",
                    projectName, springVersion, appTitle);
        }
    }

}
