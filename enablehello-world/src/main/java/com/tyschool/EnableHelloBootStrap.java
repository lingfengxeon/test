package com.tyschool;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

@EnableHello
@Configuration
public class EnableHelloBootStrap {

    public static void main(String[] args) {
        //构建Annotation配置驱动的Spring 上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册当前的引导类到Spring容器中
        context.register(EnableHelloBootStrap.class);
        //启动Spring容器
        context.refresh();
        //获取名称为helloWorld的Bean
        String bean = context.getBean("helloWorld", String.class);
        //输出
        System.out.println(bean);
        //关闭容器
        context.close();

    }
}
