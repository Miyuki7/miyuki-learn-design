package com.miyuki.learn.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: miyuki
 * @description: 登陆具体装饰器实现类
 * @date: 2023/9/4 00:08
 * @version: 1.0
 */
public class LoginSsoDecorator extends SsoDecorator{
    public LoginSsoDecorator(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    private Logger logger = LoggerFactory.getLogger(LoginSsoDecorator.class);

    private static Map<String, String> authMap = new ConcurrentHashMap<String, String>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if (!success) return false;
        String userId = request.substring(8);
        String method = authMap.get(userId);
        logger.info("模拟单点登录方法访问拦截校验：{} {}", userId, method);
        // 模拟方法校验
        return "queryUserInfo".equals(method);
    }
}
