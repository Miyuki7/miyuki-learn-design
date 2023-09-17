package com.miyuki.learn.design;

import java.util.Date;

/**
 * @author: miyuki
 * @description: 配置文件
 * @date: 2023/9/17 20:58
 * @version: 1.0
 */
public class ConfigFile {

    private String versionNo; //版本号
    private String content; //内容
    private Date dataTime; // 时间
    private String operator; // 操作人

    public ConfigFile(String versionNo, String content, Date dataTime, String operator) {
        this.versionNo = versionNo;
        this.content = content;
        this.dataTime = dataTime;
        this.operator = operator;
    }

    public String getVersionNo() {
        return versionNo;
    }

    public void setVersionNo(String versionNo) {
        this.versionNo = versionNo;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDataTime() {
        return dataTime;
    }

    public void setDataTime(Date dataTime) {
        this.dataTime = dataTime;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
