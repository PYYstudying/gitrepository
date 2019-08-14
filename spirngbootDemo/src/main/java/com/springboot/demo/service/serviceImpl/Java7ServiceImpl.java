package com.springboot.demo.service.serviceImpl;

import com.springboot.demo.service.SumService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("java7")
@Service
public class Java7ServiceImpl implements SumService {

    @Override
    public Integer sum(Integer... integers) {
        System.out.println("java7...");
        int sum = 0;
        for (int i = 0; i < integers.length; i++) {
            sum +=integers[i];
        }
        return sum;
    }
}
