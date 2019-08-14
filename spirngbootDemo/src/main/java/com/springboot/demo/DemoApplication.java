package com.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.springboot.demo.com.web")
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = new SpringApplicationBuilder(DemoApplication.class)
				.run(args);

		/*String test = run.getBean("demo", String.class);
		System.out.println(test);*/
		//SpringApplication.run(DemoApplication.class, args);
	}
}
