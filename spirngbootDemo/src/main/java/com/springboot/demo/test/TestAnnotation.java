package com.springboot.demo.test;

import com.springboot.demo.annotation.EnableDemoConfiguration;
import com.springboot.demo.configuration.DemoConfiguration;
import com.springboot.demo.dao.DaoImpl;
import com.springboot.demo.dao.DaoTestA;
import com.springboot.demo.dao.DaoTestB;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.ObjectUtils;

@ComponentScan(basePackages = "com.springboot.demo.dao",
        excludeFilters = {@ComponentScan.Filter(/*type = FilterType.ASSIGNABLE_TYPE,*/classes = {Service.class})})
//@EnableDemoConfiguration
public class TestAnnotation {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(TestAnnotation.class)
                .web(WebApplicationType.NONE)
                .run(args);

        DaoImpl daoImpl = run.getBean("daoImpl",DaoImpl.class);
        System.out.println("DaoImpl:" + daoImpl);

        DaoTestA daoTestA = run.getBean("daoTestA",DaoTestA.class);
        System.out.println("daoTestA:" + daoTestA);

        DaoTestB daoTestB = run.getBean("daoTestB",DaoTestB.class);
        System.out.println("daoTestB:" + daoTestB);

        run.close();
        //AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext()
    }
}
