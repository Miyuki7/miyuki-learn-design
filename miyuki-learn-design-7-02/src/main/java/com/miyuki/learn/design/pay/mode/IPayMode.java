package com.miyuki.learn.design.pay.mode;

/**
 * @author: miyuki
 * @description: 支付模式接口
 * @date: 2023/9/3 18:25
 * @version: 1.0
 */
public interface IPayMode {

    boolean security(String uId);
}
