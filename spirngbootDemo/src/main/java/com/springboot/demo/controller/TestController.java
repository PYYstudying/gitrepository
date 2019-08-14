package com.springboot.demo.controller;


import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController implements EnvironmentAware {

    private Environment environment;

    @GetMapping("/test")
    @ResponseBody
    public String test(){

        return "ok";
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
