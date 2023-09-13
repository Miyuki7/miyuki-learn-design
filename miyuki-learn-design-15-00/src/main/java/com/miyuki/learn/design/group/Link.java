package com.miyuki.learn.design.group;

/**
 * @author: miyuki
 * @description: 树节点链路
 * @date: 2023/9/13 21:17
 * @version: 1.0
 */
public class Link {

    private String fromId;  //雇员ID

    private String toId;  //雇员ID

    public Link(String formId, String toId) {
        this.fromId = formId;
        this.toId = toId;
    }

    public String getFromId() {
        return fromId;
    }

    public void setFromId(String fromId) {
        this.fromId = fromId;
    }

    public String getToId() {
        return toId;
    }

    public void setToId(String toId) {
        this.toId = toId;
    }
}
