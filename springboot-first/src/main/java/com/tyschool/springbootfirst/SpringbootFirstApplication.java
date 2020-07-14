package com.tyschool.springbootfirst;

import com.tyschool.springbootfirst.config.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.jdbc.EmbeddedDatabaseConnection;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;

//@SpringBootApplication(scanBasePackages = {"com.tyschools"})
@EnableAutoConfiguration //开启自动装配
@EnableWebFlux
//@ComponentScan //开启包扫描
//@Configuration //标识为一个配置类
public class SpringbootFirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFirstApplication.class, args);
    }

}
