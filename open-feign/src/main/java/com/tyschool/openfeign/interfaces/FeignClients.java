package com.tyschool.openfeign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "hystrix01")//指定服务提供者名称
public interface FeignClients {

    @GetMapping("/hello")
    public String hello();
}
