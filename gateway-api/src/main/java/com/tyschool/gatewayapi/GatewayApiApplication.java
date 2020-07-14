package com.tyschool.gatewayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class GatewayApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApiApplication.class, args);
    }

/*    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        //配置路由id为hello2，转发到http://localhost:50003/hello2
        return builder.routes().route("hello2",r->r.path("/hello2").uri("http://localhost:50003")).build();
    }*/

    @Bean
    public KeyResolver ipKeyResolver(){
        //根据Ip地址限流
        return exchange ->
            Mono.just(exchange.getRequest().getRemoteAddress().getHostName());

    }
}
