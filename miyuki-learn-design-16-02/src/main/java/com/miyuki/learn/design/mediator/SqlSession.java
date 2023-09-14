package com.miyuki.learn.design.mediator;

import java.util.List;

/**
 * @author: miyuki
 * @description: 接口
 * @date: 2023/9/14 21:50
 * @version: 1.0
 */
public interface SqlSession {

    <T> T selectOne(String statement);

    <T> T selectOne(String statement, Object parameter);

    <T>List<T> selectList(String statement);

    <T> List<T> selectList(String statement, Object parameter);

    void close();
}
