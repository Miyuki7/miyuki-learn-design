package com.miyuki.learn.design;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: miyuki
 * @description: CAS[AtomicReference](线程安全)
 * @date: 2023/8/30 22:26
 * @version: 1.0
 */
public class Singleton_06 {
    private static final AtomicReference<Singleton_06> INSTANCE = new AtomicReference<>();

    private Singleton_06(){}

    public static final Singleton_06 getInstance() {
        for (;;) {
            Singleton_06 instance = INSTANCE.get();
            if (null != instance) return instance;
            INSTANCE.compareAndSet(null, new Singleton_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_06.getInstance());
        System.out.println(Singleton_06.getInstance());
    }
}
