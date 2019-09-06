package com.dailycodebuffer.examples.SpringBootTutorial.config;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

    @Override
    public Health health() {

        int errorCode = check(); // perform some specific health check
        if (errorCode != 0) {
            return Health.down().withDetail("Error Code", errorCode).build();
        }
        return Health.up()
                .withDetail("app", "I m Alive and Rocking")
                .withDetail("error", "I am suffering from pain !!")
                .build();
    }

    public int check() {
        // Your Own logic to check health
        return 0;
    }
}
