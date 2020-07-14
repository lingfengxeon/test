package com.tyschool.eurekaprovider.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    //拿到服务名称
    @Value("${povider.name}")
    private String name;

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name",required = false)String name){
        if (!StringUtils.isEmpty(name)){
            this.name=name;
        }
        return this.name;
    }

    @GetMapping("/hello2")
    public String hello2(){
        return name;
    }

    @GetMapping("/test")
    public String test(){
        return name;
    }
}
