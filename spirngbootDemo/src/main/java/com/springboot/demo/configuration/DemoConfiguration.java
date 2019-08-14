package com.springboot.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Bean
    public String demo(){
        System.out.println("demo ok init=====");
        return "demo ok";
    }
}
