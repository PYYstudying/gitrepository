package com.springboot.springapplication.context;

import com.springboot.springapplication.controller.TestController;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;


public class AfterApplicationContextInitializer implements
        ApplicationContextInitializer<ConfigurableApplicationContext> ,Ordered{
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        /*TestController testController = applicationContext.getBean(TestController.class);
        System.out.println("testController:"+testController.toString());*/
        System.out.println("afterApplicationContextInitializer.id = "+applicationContext.getId());
    }

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
