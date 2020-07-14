package com.tyschool;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc //开启Web MVC
@ComponentScan(basePackageClasses = SpringWebMvcConfiguration.class)//扫描此类所在的包及子包
@Configuration
public class SpringWebMvcConfiguration {
}
