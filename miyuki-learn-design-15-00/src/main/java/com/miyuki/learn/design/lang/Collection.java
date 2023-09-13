package com.miyuki.learn.design.lang;

/**
 * @author: miyuki
 * @description: 模仿集合类
 * @date: 2023/9/13 21:07
 * @version: 1.0
 */
public interface Collection<E, L> extends Iterable<E> {

    boolean add(E e);

    boolean remove(E e);

    boolean addLink(String key, L l);

    boolean removeLink(String key);

    Iterator<E> iterator();
}
