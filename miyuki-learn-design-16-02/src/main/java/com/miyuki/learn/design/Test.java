package com.miyuki.learn.design;

import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author: miyuki
 * @description: 测试
 * @date: 2023/9/15 14:19
 * @version: 1.0
 */
public class Test {

    public static void main(String[] args) {
        //匿名类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello1");
            }
        }).start();
        //lambda
        new Thread(() -> {
            System.out.println("hello2");
        }).start();

        //函数式接口
        Supplier<String> stringSupplier = () -> "0k";
        Supplier<String> supplier = String::new;

        Predicate<Integer> positiveNumber = i -> i > 0;
        Predicate<Integer> evenNumber = i -> i % 2 == 0;

    }
}
