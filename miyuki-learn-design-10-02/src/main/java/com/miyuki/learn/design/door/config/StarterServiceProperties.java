package com.miyuki.learn.design.door.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author: miyuki
 * @description: 配置类注解定义
 * @date: 2023/9/5 21:14
 * @version: 1.0
 */
@ConfigurationProperties("itstack.door")
public class StarterServiceProperties {

    private String userStr;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }
}
