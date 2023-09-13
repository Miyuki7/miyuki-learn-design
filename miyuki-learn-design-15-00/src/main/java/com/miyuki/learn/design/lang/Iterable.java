package com.miyuki.learn.design.lang;

/**
 * @author: miyuki
 * @description: 迭代
 * @date: 2023/9/13 21:00
 * @version: 1.0
 */
public interface Iterable<E> {

    Iterator<E> iterator();
}
