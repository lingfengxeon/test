package com.tyschool.gatewayapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotFoundController {

    /***
     * 当没有匹配到路由信息时,用来返回信息
     */
    @RequestMapping(value = "/notfound")
    public Mono<Map<String,String>> notFound(){
        Map<String, String> map = new HashMap<>();
        map.put("code","404");
        map.put("data","notfound");
        return Mono.just(map);
    }
}
