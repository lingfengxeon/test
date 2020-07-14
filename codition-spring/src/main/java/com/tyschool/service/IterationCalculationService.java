package com.tyschool.service;

import com.tyschool.interfaces.CalculatingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Java7")
public class IterationCalculationService implements CalculatingService {
    @Override
    public Integer sum(Integer... values) {
        int sum=0;
        for (Integer value: values){
            sum+=value;
        }
        System.out.println("[Java 7累加结果:]"+sum);
        return sum;
    }
}
