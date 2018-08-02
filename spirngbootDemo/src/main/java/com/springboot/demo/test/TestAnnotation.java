package com.springboot.demo.test;

import com.springboot.demo.dao.DaoImpl;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

//@ComponentScan(basePackages = "com.springboot.demo.dao")
@EnableAutoConfiguration
public class TestAnnotation {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(TestAnnotation.class).web(WebApplicationType.NONE)
                .run(args);
        DaoImpl daoImpl = run.getBean("daoImpl",DaoImpl.class);
        System.out.println(ObjectUtils.isEmpty(daoImpl));
        run.close();
    }
}
