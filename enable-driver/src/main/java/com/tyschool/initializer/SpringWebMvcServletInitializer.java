package com.tyschool.initializer;

import com.tyschool.SpringWebMvcConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebMvcServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    //DispatcherServlet配置Bean
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return of(SpringWebMvcConfiguration.class);
    }

    //DispatcherServlet URL Pattern映射
    @Override
    protected String[] getServletMappings() {
        return of("/*");
    }

    private static <T> T [] of(T... values){
        return values;
    }
}
