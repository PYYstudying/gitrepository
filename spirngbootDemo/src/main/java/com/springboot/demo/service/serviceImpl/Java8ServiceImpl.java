package com.springboot.demo.service.serviceImpl;

import com.springboot.demo.service.SumService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Profile("java8")
@Service
public class Java8ServiceImpl implements SumService {

    @Override
    public Integer sum(Integer... integers) {
        System.out.println("java8...");
        return  Stream.of(integers).reduce(0,Integer::sum);
    }
}
