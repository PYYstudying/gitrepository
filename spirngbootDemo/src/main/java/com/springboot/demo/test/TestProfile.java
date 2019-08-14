package com.springboot.demo.test;

import com.springboot.demo.annotation.EnableDemoConfiguration;
import com.springboot.demo.service.SumService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author  PengYangYang
 * @create  2018/8/2 17:31
 * @desc   基于java7的profile来实现不同profile下bean的应用
 **/

//@ComponentScan(basePackages = "com.springboot.demo.dao")
@SpringBootApplication(scanBasePackages = "com.springboot.demo.service")
public class TestProfile {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(TestProfile.class)
                .web(WebApplicationType.NONE)
                .profiles("java7")
                .run(args);
        SumService sumService = run.getBean(SumService.class);
        System.out.println(sumService.sum(1,2,3,4,5,6,7,8,9,10));
        run.close();
    }
}
