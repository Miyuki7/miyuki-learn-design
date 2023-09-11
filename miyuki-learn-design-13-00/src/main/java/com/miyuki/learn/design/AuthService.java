package com.miyuki.learn.design;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: miyuki
 * @description: 简陋版
 * @date: 2023/9/11 21:56
 * @version: 1.0
 */
public class AuthService {

    private static Map<String, Date> authMap = new ConcurrentHashMap<>();

    public static Date queryAuthInfo(String uId, String orderId) {
        return authMap.get(uId.concat(orderId));
    }

    public static void auth(String uId, String orderId) {
        authMap.put(uId.concat(orderId), new Date());
    }
}
