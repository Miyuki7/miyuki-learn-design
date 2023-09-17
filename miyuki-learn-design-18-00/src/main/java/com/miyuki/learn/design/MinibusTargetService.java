package com.miyuki.learn.design;

/**
 * @author: miyuki
 * @description: 建议接口
 * @date: 2023/9/17 21:54
 * @version: 1.0
 */
public class MinibusTargetService {

    public String lottery(String uId) {
        return Math.abs(uId.hashCode()) % 2 == 0 ? "恭喜你，编码".concat(uId).concat("在本次摇号中签") : "很遗憾，编码".concat(uId).concat("在本次摇号未中签或摇号资格已过期");
    }
}
