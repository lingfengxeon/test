package com.tyschool.gatewayapi.filters;

import org.apache.commons.lang.StringUtils;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

public class TockenFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        //1.从请求中取出token参数
        String tocken = exchange.getRequest().getQueryParams().getFirst("tocken");
        //2.如果null或空值返回401未认证错误
        if (StringUtils.isEmpty(tocken)){
            exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return exchange.getResponse().setComplete();
        }
        //如果不为Null或者不为空,则放行
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }
}
