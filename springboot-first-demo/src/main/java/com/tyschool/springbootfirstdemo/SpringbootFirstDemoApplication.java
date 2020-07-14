package com.tyschool.springbootfirstdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@EnableAutoConfiguration
public class SpringbootFirstDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstDemoApplication.class, args);
    }

}
