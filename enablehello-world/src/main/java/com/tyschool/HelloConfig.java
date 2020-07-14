package com.tyschool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    /***
     * 构建一个名为helloWorld的Bean，类型是String
     */
    @Bean
    public String helloWorld(){
        return "Hello World!";
    }
}
