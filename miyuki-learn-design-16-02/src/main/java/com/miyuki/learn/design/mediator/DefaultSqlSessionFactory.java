package com.miyuki.learn.design.mediator;

/**
 * @author: miyuki
 * @description: 具体实现类
 * @date: 2023/9/16 22:08
 * @version: 1.0
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory{
    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration.connection, configuration.mapperElement);
    }
}
