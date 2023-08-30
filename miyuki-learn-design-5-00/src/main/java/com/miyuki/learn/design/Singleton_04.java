package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 使用类的内部类(线程安全) 推荐
 * @date: 2023/8/30 22:20
 * @version: 1.0
 */
public class Singleton_04 {

    private static class SingletonHolder {
        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04() {}

    public static Singleton_04 getInstance() {
        return SingletonHolder.instance;
    }
}
