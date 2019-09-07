package com.dailycodebuffer.examples.SpringBootWebApp.config;

import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class CustomContextPath implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory factory) {
        //This same can be set from Application.properties file
        factory.setContextPath("/springbootwebapp");
        /*For Custom Error Pages COnfiguration*/
        factory.addErrorPages(new ErrorPage(HttpStatus.BAD_REQUEST,"/400"));
        factory.addErrorPages(new ErrorPage("/errorCustom"));
    }


}
