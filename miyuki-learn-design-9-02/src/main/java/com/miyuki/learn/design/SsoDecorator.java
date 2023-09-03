package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: sso装饰器类
 * @date: 2023/9/4 00:05
 * @version: 1.0
 */
public abstract class SsoDecorator implements HandlerInterceptor{

    private HandlerInterceptor handlerInterceptor;

    private SsoDecorator() {}

    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
