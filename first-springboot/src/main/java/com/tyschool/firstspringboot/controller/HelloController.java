package com.tyschool.firstspringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {

    //处理请求
    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot !";
    }
}
