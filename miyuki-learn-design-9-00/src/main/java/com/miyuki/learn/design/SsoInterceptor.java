package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: Sso单点登录
 * @date: 2023/9/3 23:48
 * @version: 1.0
 */
public class SsoInterceptor implements HandlerInterceptor{

    public boolean preHandle(String request, String reponse, Object handler) {
        String ticket = request.substring(1, 8);

        return ticket.equals("success");
    }
}
