package com.tyschool.springbootfirst.config;

import com.tyschools.HelloController;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

//@SpringBootApplication(scanBasePackages = {"com.tyschools"})
//@EnableAutoConfiguration //开启自动装配
//@ComponentScan(basePackages = {"com.tyschools"})//包扫描
@Configuration
public class WebConfig {

    //定义路由,访问/helloWorld,返回Hello World
    @Bean
    public RouterFunction<ServerResponse> helloWorld(){
        return RouterFunctions.route(RequestPredicates.GET("/helloWorld"),request->ServerResponse.ok().body(Mono.just("Hello World"),String.class));
    }
    //项目启动时，打印相关信息
    @Bean
    public ApplicationRunner runner(BeanFactory beanFactory){
        return agrs->{
            System.out.println("当前Hello Bean实现类:"+beanFactory.getBean("helloWorld").getClass().getName());
            System.out.println("当前WebConfig实现类:"+beanFactory.getBean(WebConfig.class).getClass().getName());
        };
    }
    @Bean
    public HelloController getHelloController(){
        return new HelloController();
    }
}

