package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 登陆处理接口
 * @date: 2023/9/3 23:45
 * @version: 1.0
 */
public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);
}
