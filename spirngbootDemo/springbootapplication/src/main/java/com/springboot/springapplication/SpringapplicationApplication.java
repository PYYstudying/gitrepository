package com.springboot.springapplication;

import com.springboot.springapplication.controller.TestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;

@SpringBootApplication
public class SpringapplicationApplication {

	public static void main(String[] args) {

		new SpringApplicationBuilder(SpringapplicationApplication.class)
				.run(args);

		/*HashSet<String> set = new HashSet<>();
		set.add(SpringapplicationApplication.class.getName());
		SpringApplication springApplication = new SpringApplication();
		springApplication.setSources(set);
		//springApplication.setWebApplicationType(WebApplicationType.NONE);
		ConfigurableApplicationContext run = springApplication.run(args);
		System.out.println("当前上下文：" + run.getClass().getName());
		TestController bean = run.getBean(TestController.class);
		System.out.println("bean:"+bean);*/

		//SpringApplication.run(SpringapplicationApplication.class, args);
	}

}
