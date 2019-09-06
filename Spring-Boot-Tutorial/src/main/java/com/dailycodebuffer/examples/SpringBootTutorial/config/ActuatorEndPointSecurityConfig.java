package com.dailycodebuffer.examples.SpringBootTutorial.config;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.boot.actuate.context.ShutdownEndpoint;
import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//@Configuration
public class ActuatorEndPointSecurityConfig  extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
    //Remove this class and Configure with SecurityCOnfig class i case of errors
        http.requestMatcher(EndpointRequest.toAnyEndpoint()).authorizeRequests()
                    .anyRequest().hasRole("ACTUATOR_ENDPOINT_ADMIN")
                    .and()
                    .httpBasic();
        }
}
