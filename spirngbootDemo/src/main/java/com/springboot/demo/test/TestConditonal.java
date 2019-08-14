package com.springboot.demo.test;

import com.springboot.demo.annotation.EnableDemoConfiguration;
import com.springboot.demo.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@ConditionOnSystemProperty(name = "user.name" ,value = "pyy")
public class TestConditonal {

    /*@Bean
    @ConditionOnSystemProperty(name = "user.name",value = "!Think")
    public String test(){
        return "test ok";
    }*/

    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(TestConditonal.class)
                .web(WebApplicationType.NONE)
                .run(args);
       /* String test = run.getBean("test", String.class);
        System.out.println(test);*/
        run.close();
    }
}
