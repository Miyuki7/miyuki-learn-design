package com.miyuki.learn.design.user;

import com.miyuki.learn.design.visitor.Visitor;

/**
 * @author: miyuki
 * @description: user
 * @date: 2023/9/18 15:53
 * @version: 1.0
 */
public abstract class User {

    public String name; // 姓名
    public String identity;  // 身份；重点班、普通班 | 特级教师、普通教师、实习教师
    public String clazz;     // 班级

    public User(String name, String identity, String clazz) {
        this.name = name;
        this.identity = identity;
        this.clazz = clazz;
    }

    public abstract void accept(Visitor visitor);
}
