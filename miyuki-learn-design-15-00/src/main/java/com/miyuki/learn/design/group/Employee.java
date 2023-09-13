package com.miyuki.learn.design.group;

/**
 * @author: miyuki
 * @description: 雇员
 * @date: 2023/9/13 21:22
 * @version: 1.0
 */
public class Employee {

    private String uId; //ID
    private String name; //姓名
    private String desc; //备注

    public Employee(String uId, String name) {
        this.uId = uId;
        this.name = name;
    }

    public Employee(String uId, String name, String desc) {
        this.uId = uId;
        this.name = name;
        this.desc = desc;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
