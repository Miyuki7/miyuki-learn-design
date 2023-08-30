package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 懒汉模式(线程安全) 整个方法锁定
 * @date: 2023/8/30 22:15
 * @version: 1.0
 */
public class Singleton_02 {

    private static Singleton_02 instance;

    private Singleton_02() {

    }

    public static synchronized Singleton_02 getInstance() {
        if (null != instance) return instance;
        instance = new Singleton_02();
        return instance;
    }
}
