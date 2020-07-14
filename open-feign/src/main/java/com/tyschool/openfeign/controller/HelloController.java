package com.tyschool.openfeign.controller;

import com.tyschool.openfeign.interfaces.FeignClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    FeignClients feignClients;

    @GetMapping("/hello")
    public String hello(){
        return feignClients.hello();
    }
}
