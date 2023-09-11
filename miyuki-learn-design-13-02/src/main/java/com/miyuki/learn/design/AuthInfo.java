package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 信息
 * @date: 2023/9/11 22:02
 * @version: 1.0
 */
public class AuthInfo {
    private String code;
    private String info = "";

    public AuthInfo(String code, String ...infos) {
        this.code = code;
        for (String str:infos){
            this.info = this.info.concat(str);
        }
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
