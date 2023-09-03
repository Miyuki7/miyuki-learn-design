package com.miyuki.learn.design.test;

import com.miyuki.learn.design.PayController;
import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author: miyuki
 * @description: 测试类
 * @date: 2023/9/3 18:14
 * @version: 1.0
 */
public class ApiTest {

    @Test
    public void test_pay() {
        PayController pay = new PayController();

        System.out.println("\r\n模拟测试场景；微信支付、人脸方式。");
        pay.doPay("weixin_1092033111", "100000109893", new BigDecimal(100), 1, 2);

        System.out.println("\r\n模拟测试场景；支付宝支付、指纹方式。");
        pay.doPay("jlu19dlxo111","100000109894",new BigDecimal(100), 2, 3);    }
}
