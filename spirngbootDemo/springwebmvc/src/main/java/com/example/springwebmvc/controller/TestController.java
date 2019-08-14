package com.example.springwebmvc.controller;

import com.example.springwebmvc.annotation.CustomAnnotation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CustomAnnotation
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "test ok";
    }
}
