package com.tyschool.exitspringboot;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
public class ExiteCodeGeneratorBootStrap {

    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
        return ()->{
            System.out.println("执行退出码88");
            return 88;
        };
    }

    public static void main(String[] args) {
        //在非web应用中退出
        SpringApplication.exit(new SpringApplicationBuilder(ExiteCodeGeneratorBootStrap.class).web(WebApplicationType.NONE).run(args));
    }
}
