package com.tyschool.hystrix.controller;

import com.tyschool.hystrix.interfaces.FeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    FeignClients feignClients;

    @GetMapping("/hello")
    public String index(){
        return feignClients.hello();
    }
}
