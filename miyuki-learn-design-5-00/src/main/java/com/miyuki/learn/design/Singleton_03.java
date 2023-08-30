package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 饿汉模式(线程安全),并不是懒加载，与00很相似
 * @date: 2023/8/30 22:18
 * @version: 1.0
 */
public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03() {}

    public static Singleton_03 getInstance() {
        return instance;
    }
}
