package com.tyschool.hystrix.interfaces;

import com.tyschool.hystrix.fallbacks.HelloStrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
@Component
@FeignClient(name = "hystrix02",fallback = HelloStrix.class)
public interface FeignClients {

    @GetMapping("/hello")
    public String hello();
}
