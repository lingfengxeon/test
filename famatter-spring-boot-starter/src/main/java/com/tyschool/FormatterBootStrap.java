package com.tyschool;

import com.tyschool.interfaces.Formatter;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class FormatterBootStrap {

    public static void main(String[] args) {
        //创建 Spring 上下文
        ConfigurableApplicationContext context = new SpringApplicationBuilder(FormatterBootStrap.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
        //创建map
        Map<String, Object> map = new HashMap<>();
        map.put("name","tyschool");
        Map<String, Formatter> beans = context.getBeansOfType(Formatter.class);
        //格式化输出数据
        beans.forEach((beanName,formatter)->{
            System.out.println(beanName+" "+formatter.getClass().getSimpleName()+" "+formatter.format(map));
        });
        //关闭上下文
        context.close();
    }
}
