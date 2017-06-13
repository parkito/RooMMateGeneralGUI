package com.roommate.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;

/**
 * @author Artem Karnov @date 6/14/17.
 *         artem.karnov@t-systems.com
 */
@Configuration
@ComponentScan(basePackages = {"com.roommate.controller"})
public class ControllerConfig {
    @Bean
    public RequestContextListener requestContextListener() {
        return new RequestContextListener();
    }
}
