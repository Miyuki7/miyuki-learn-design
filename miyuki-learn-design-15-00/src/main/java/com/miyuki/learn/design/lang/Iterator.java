package com.miyuki.learn.design.lang;

/**
 * @author: miyuki
 * @description: 迭代器
 * @date: 2023/9/13 21:03
 * @version: 1.0
 */
public interface Iterator<E> {

    boolean hasNext();

    E next();
}
