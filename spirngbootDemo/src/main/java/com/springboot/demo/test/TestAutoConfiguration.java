package com.springboot.demo.test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;


@EnableAutoConfiguration
public class TestAutoConfiguration {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(TestAutoConfiguration.class)
                .web(WebApplicationType.NONE).run(args);

        String test = run.getBean("demo", String.class);
        System.out.println(test);
        run.close();
    }
}
