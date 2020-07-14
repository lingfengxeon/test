package com.tyschool.gatewayapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FallbackController {

    /***
     * 当服务不可用时，触发
     */
    @GetMapping("/fallback")
    public Mono<Map<String,String>> fallback(){
        Map<String, String> map = new HashMap<>();
        map.put("code","100");
        map.put("data","Service Not Available");
        return Mono.just(map);
    }
}
