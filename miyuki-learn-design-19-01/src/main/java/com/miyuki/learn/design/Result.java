package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 返回实体类
 * @date: 2023/9/18 10:18
 * @version: 1.0
 */
public class Result {

    private String code; // 编码
    private String info; // 描述

    public Result(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
