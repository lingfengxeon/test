package com.tyschool;

import com.tyschool.interfaces.CalculatingService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.AbstractEnvironment;

@Configuration
@ComponentScan(basePackages = "com.tyschool")

public class CalculationServiceBootStrap {

    static {
        //通过Java系统属性设置Spring Profile
        System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME,"Java8");
        System.setProperty(AbstractEnvironment.DEFAULT_PROFILES_PROPERTY_NAME,"Java7");
    }

    public static void main(String[] args) {
        //构建Annotation配置驱动Spring 上下文
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //注册当前配置Bean到SPring容器中
        context.register(CalculationServiceBootStrap.class);
        //启动容器
        context.refresh();
        //获取CaculatingService
        CalculatingService bean = context.getBean(CalculatingService.class);
        //输出累加结果
        bean.sum(1,2,3,4,5);
        //关闭容器
        context.close();
    }
}
