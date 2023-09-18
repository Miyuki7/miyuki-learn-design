package com.miyuki.learn.design.user.impl;

import com.miyuki.learn.design.user.User;
import com.miyuki.learn.design.visitor.Visitor;

import java.math.BigDecimal;

/**
 * @author: miyuki
 * @description: 教师
 * @date: 2023/9/18 16:00
 * @version: 1.0
 */
public class Teacher extends User {


    public Teacher(String name, String identity, String clazz) {
        super(name, identity, clazz);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public double entranceRatio() {
        return BigDecimal.valueOf(Math.random() * 100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }
}
