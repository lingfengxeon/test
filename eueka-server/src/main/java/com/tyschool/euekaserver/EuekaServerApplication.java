package com.tyschool.euekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EuekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuekaServerApplication.class, args);
    }

}
