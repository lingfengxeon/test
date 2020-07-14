package com.tyschool.auto;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tyschool.impl.DefaultFormatter;
import com.tyschool.impl.JsonFormatter;
import com.tyschool.interfaces.Formatter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;

@Configuration
public class FormatterAutoConfiguation {

    //创建Formatter Bean
    @Bean
    @ConditionalOnMissingClass(value = "com.fasterxml.jackson.databind.ObjectMapper")
    public Formatter defaultFormatter(){
        return new DefaultFormatter();
    }

    @Bean
    @ConditionalOnClass(name = "com.fasterxml.jackson.databind.ObjectMapper")
    @ConditionalOnMissingBean(Servlet.class)
    public Formatter jsonFormatter(){
        return new JsonFormatter();
    }

    @Bean
    @ConditionalOnBean(Servlet.class)//如果classpath下有servlet
    public Formatter objectMapperFormatter(ObjectMapper objectMapper){
        return new JsonFormatter(objectMapper);
    }
}
