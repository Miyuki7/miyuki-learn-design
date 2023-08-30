package com.miyuki.learn.design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: miyuki
 * @description: 静态类，直接初始
 * @date: 2023/8/30 22:11
 * @version: 1.0
 */
public class Singleton_00 {

    public static Map<String, String> cache = new ConcurrentHashMap<>();

}
