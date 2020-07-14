package com.tyschool.sentineldemo2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/related")
public class RelatedController {

    @GetMapping("/a")
    public String flowRelatedA(){
        return "a接口";
    }

    @GetMapping("/b")
    public String flowRelatedB(){
        return "b接口";
    }
}
