package com.tyschools;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller+@ResponseBody
@RestController
public class HelloController {

    @Value("${company}")
    private String company;
    /***
     * 处理Get请求/hello
     */
    //@RequestMapping中指定RequestMethod为Get请求
    @GetMapping("/hello")
    public String hello(){
        return company;
    }

}
