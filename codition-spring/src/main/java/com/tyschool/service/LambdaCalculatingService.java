package com.tyschool.service;

import com.tyschool.interfaces.CalculatingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

@Service
@Profile("Java8")
public class LambdaCalculatingService implements CalculatingService {
    @Override
    public Integer sum(Integer... values) {
        Integer sum = Stream.of(values).reduce(0, Integer::sum);
        System.out.println("[Java8 实现的累加结果:]"+sum);
        return sum;
    }
}
