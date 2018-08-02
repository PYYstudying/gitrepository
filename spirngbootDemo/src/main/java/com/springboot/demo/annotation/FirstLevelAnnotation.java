package com.springboot.demo.annotation;

import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
public @interface FirstLevelAnnotation {

    String value() default "";

}
