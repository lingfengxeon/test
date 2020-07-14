package com.tyschool.exceptionspringboot.exceptions;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;

@Configuration
public class GlobalException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception e) {
        ModelAndView mv = new ModelAndView();
        //判断不同的异常类型 ，做不同的跳转
        if (e instanceof ArithmeticException){
            mv.setViewName("error");
        }
        mv.addObject("error",e.toString());
        return mv;
    }

    /**
     * 该方法需要返回一个modelAndView 目的是可以让我们封装异常信息以及视图的指定
     * @param ex 会将产生的异常信息注入到方法中
     * @return
     */
    /*@ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticExceptionHandler(Exception ex){
        ModelAndView mv = new ModelAndView();
        mv.addObject("error",ex.toString());
        mv.setViewName("error");
        return mv;
    }*/
    /*@Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver(){
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties mappings = new Properties();
        *//**
     * 参数一: 异常的类型 ，全名
     * 参数二: 视图名称
     *//*
        mappings.put("java.lang.ArithmeticException.class","error");
        //设置异常与视图映射信息
        resolver.setExceptionMappings(mappings);
        return resolver;
    }*/


}
