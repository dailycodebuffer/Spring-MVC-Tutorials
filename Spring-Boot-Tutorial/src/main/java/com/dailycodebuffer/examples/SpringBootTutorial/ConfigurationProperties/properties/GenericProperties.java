package com.dailycodebuffer.examples.SpringBootTutorial.ConfigurationProperties.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:generic.properties")
public class GenericProperties {

    @Value("${appName}")
    private String appName;

    @Value("${email}")
    private String email;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
