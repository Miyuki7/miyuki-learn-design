package com.miyuki.learn.design.model.vo;

/**
 * @author: miyuki
 * @description: 规则树线信息
 * @date: 2023/9/3 20:07
 * @version: 1.0
 */
public class TreeNodeLink {

    private Long nodeIdFrom;  //节点From
    private Long nodeIdTo; //节点To
    private Integer ruleLimitType; //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[枚举范围]；
    private String ruleLimitValue; //限定值

    public Long getNodeIdFrom() {
        return nodeIdFrom;
    }

    public void setNodeIdFrom(Long nodeIdFrom) {
        this.nodeIdFrom = nodeIdFrom;
    }

    public Long getNodeIdTo() {
        return nodeIdTo;
    }

    public void setNodeIdTo(Long nodeIdTo) {
        this.nodeIdTo = nodeIdTo;
    }

    public Integer getRuleLimitType() {
        return ruleLimitType;
    }

    public void setRuleLimitType(Integer ruleLimitType) {
        this.ruleLimitType = ruleLimitType;
    }

    public String getRuleLimitValue() {
        return ruleLimitValue;
    }

    public void setRuleLimitValue(String ruleLimitValue) {
        this.ruleLimitValue = ruleLimitValue;
    }
}
