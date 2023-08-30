package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 双重锁校验(线程安全),锁的粒度变小了
 * @date: 2023/8/30 22:23
 * @version: 1.0
 */
public class Singleton_05 {

    private static volatile Singleton_05 instance;

    private Singleton_05() {}

    public static Singleton_05 getInstance() {
        if (null != instance) return instance;
        synchronized (Singleton_05.class) {
            if (null == instance) {
                instance = new Singleton_05();
            }
        }
        return instance;
    }
}
