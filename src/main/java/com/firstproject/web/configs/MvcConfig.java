package com.firstproject.web.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry){
    registry.addViewController("/").setViewName("/");
    registry.addViewController("/api/view").setViewName("/api/view");
    registry.addViewController("/test").setViewName("/test");
//  registry.addViewController("/register").setViewName("/register");
//  registry.addViewController("/doRegister").setViewName("/doRegister");

    }
}
