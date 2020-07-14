package com.tyschool.sentineldemo2;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SentinelDemo2Application {

    public static void main(String[] args) {
        SpringApplication.run(SentinelDemo2Application.class, args);
    }
    @RestController
    public class TestController{

        @GetMapping("/hello")
        @SentinelResource("hello")
        public String hello(){
            return "Hello Sentinel Demo!";
        }
    }
}
