package com.springboot.demo.annotation;

import com.springboot.demo.configuration.DemoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(DemoConfiguration.class)
//@Import(DemoImportSelector.class)
public @interface EnableDemoConfiguration {

}
