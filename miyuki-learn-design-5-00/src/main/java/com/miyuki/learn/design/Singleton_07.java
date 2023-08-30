package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: Effective Java作者推荐的枚举单例线程安全
 * @date: 2023/8/30 22:33
 * @version: 1.0
 */
public enum Singleton_07 {
    INSTANCE;
    public void test() {
        System.out.println("hi~");
    }
}
