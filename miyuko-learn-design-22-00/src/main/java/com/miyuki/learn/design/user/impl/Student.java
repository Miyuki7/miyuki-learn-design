package com.miyuki.learn.design.user.impl;

import com.miyuki.learn.design.user.User;
import com.miyuki.learn.design.visitor.Visitor;

/**
 * @author: miyuki
 * @description: 学生
 * @date: 2023/9/18 15:57
 * @version: 1.0
 */
public class Student extends User {

    public Student(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int ranking() {
        return (int) (Math.random() * 100);
    }
}
