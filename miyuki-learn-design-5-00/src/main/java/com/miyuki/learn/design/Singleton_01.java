package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 懒汉模式（线程不安全）
 * @date: 2023/8/30 22:13
 * @version: 1.0
 */
public class Singleton_01 {

    private static Singleton_01 instance;

    public static Singleton_01 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }
}
