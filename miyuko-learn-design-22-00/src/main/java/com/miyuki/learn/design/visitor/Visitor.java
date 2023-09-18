package com.miyuki.learn.design.visitor;

import com.miyuki.learn.design.user.impl.Student;
import com.miyuki.learn.design.user.impl.Teacher;

/**
 * @author: miyuki
 * @description: 观察者接口
 * @date: 2023/9/18 15:55
 * @version: 1.0
 */
public interface Visitor {

    // 访问学生信息
    void visit(Student student);

    //访问教师信息
    void visit(Teacher teacher);
}
