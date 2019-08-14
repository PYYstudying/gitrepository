package com.springboot.demo.autoConfiguration;


import com.springboot.demo.annotation.EnableDemoConfiguration;
import com.springboot.demo.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDemoConfiguration
@ConditionOnSystemProperty(name = "user.name",value = "Think")
public class MyCustumAutoConfiguration {

    @Bean
    public String myAutoConfig(){
        System.out.println("autoConfig====");
        return "autoConfig";
    }
}
