package com.thenestedpearl.config;

import com.thenestedpearl.backend.service.EmailService;
import com.thenestedpearl.backend.service.MockEmailService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by omsairam on 03/06/2017.
 */
@Configuration
@Profile("dev")
@PropertySource("file:///${user.home}/.thenestedpearl/application-dev.properties")
public class DevelopmentConfig {

    //@Value("${stripe.test.private.key}")
    //private String stripeDevKey;

    @Bean
    public EmailService emailService() {
        return new MockEmailService();
    }

  /*  @Bean
    public ServletRegistrationBean h2ConsoleServletRegistration() {
        ServletRegistrationBean bean = new ServletRegistrationBean(new WebServlet());
        bean.addUrlMappings("/console/*");
        return bean;
    }

    @Bean
    public String stripeKey() {
        return stripeDevKey;
    }*/
}
