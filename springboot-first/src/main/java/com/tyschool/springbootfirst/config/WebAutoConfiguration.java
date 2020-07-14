package com.tyschool.springbootfirst.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@ConditionalOnWebApplication
@Configuration
@Import(WebConfig.class)
public class WebAutoConfiguration {
}
