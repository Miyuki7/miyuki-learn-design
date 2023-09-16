package com.miyuki.learn.design.mediator;

import java.sql.Connection;
import java.util.Map;

/**
 * @author: miyuki
 * @description: 配置文件
 * @date: 2023/9/16 22:09
 * @version: 1.0
 */
public class Configuration {

    protected Connection connection;
    protected Map<String, String> dataSource;

    protected Map<String, XNode> mapperElement;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public void setDataSource(Map<String, String> dataSource) {
        this.dataSource = dataSource;
    }

    public void setMapperElement(Map<String, XNode> mapperElement) {
        this.mapperElement = mapperElement;
    }
}
