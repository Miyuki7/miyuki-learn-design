package com.miyuki.learn.design.visitor.impl;

import com.miyuki.learn.design.user.impl.Student;
import com.miyuki.learn.design.user.impl.Teacher;
import com.miyuki.learn.design.visitor.Visitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: miyuki
 * @description: 家长视角
 * @date: 2023/9/18 16:12
 * @version: 1.0
 */
public class Parent implements Visitor {

    private Logger logger = LoggerFactory.getLogger(Parent.class);
    @Override
    public void visit(Student student) {
        logger.info("学生信息 姓名：{} 班级：{} 排名：{}", student.name, student.clazz, student.ranking());
    }

    public void visit(Teacher teacher) {
        logger.info("老师信息 姓名：{} 班级：{} 级别：{}", teacher.name, teacher.clazz, teacher.identity);
    }
}
