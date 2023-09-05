package com.miyuki.learn.design.door.config;


import org.apache.commons.lang3.StringUtils;

/**
 * @author: miyuki
 * @description: 配置服务类
 * @date: 2023/9/5 21:09
 * @version: 1.0
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.userStr, separatorChar);
    }
}
