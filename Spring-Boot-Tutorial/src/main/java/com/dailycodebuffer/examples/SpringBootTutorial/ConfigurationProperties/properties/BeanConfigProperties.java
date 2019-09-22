package com.dailycodebuffer.examples.SpringBootTutorial.ConfigurationProperties.properties;

import com.dailycodebuffer.examples.SpringBootTutorial.ConfigurationProperties.util.Book;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigProperties {

    @Bean
    @ConfigurationProperties(prefix = "book")
    public Book book()
    {
        return  new Book();
    }
}
