package com.tyschool.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tyschool.interfaces.Formatter;

public class JsonFormatter implements Formatter {

    private final ObjectMapper objectMapper;

    public JsonFormatter(){
        this(new ObjectMapper());

    }
    public JsonFormatter(ObjectMapper objectMapper){
        this.objectMapper=new ObjectMapper();
    }
    //将对象转换为Json字符串
    @Override
    public String format(Object obj) {

        try{
            return objectMapper.writeValueAsString(obj);
        }catch (Exception ex){
            throw new IllegalArgumentException(ex);
        }
    }
}
