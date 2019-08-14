package com.springboot.springapplication;

import com.springboot.springapplication.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.springboot.springapplication")
public class SpringApplicationConfiguration {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(SpringApplicationConfiguration.class, args);
        System.out.println("当前上下文：" + run.getClass().getName());
        SpringApplicationConfiguration bean1 = run.getBean(SpringApplicationConfiguration.class);
        System.out.println("SpringApplicationConfiguration: "+ bean1);
        TestController bean = run.getBean(TestController.class);
        System.out.println("bean:"+bean);
    }

}
