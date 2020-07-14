package com.tyschool.hystrix.fallbacks;

import com.tyschool.hystrix.interfaces.FeignClients;
import org.springframework.stereotype.Component;

@Component
public class HelloStrix implements FeignClients {
    @Override
    public String hello() {
        return "出现错误！";
    }
}
