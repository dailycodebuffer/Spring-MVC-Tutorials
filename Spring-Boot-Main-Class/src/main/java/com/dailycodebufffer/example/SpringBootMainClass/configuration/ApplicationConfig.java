package com.dailycodebufffer.example.SpringBootMainClass.configuration;

import com.dailycodebufffer.example.SpringBootMainClass.filter.MyCustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public FilterRegistrationBean<MyCustomFilter> filterRegistrationBean() {
        FilterRegistrationBean < MyCustomFilter > registrationBean = new FilterRegistrationBean();
        MyCustomFilter myCustomFilter = new MyCustomFilter();

        registrationBean.setFilter(myCustomFilter);
        registrationBean.addUrlPatterns("/filterExample/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }
}
