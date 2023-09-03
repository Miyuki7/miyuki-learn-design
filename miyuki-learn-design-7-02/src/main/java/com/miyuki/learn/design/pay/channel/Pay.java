package com.miyuki.learn.design.pay.channel;

import com.miyuki.learn.design.pay.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;


/**
 * @author: miyuki
 * @description: 支付抽象类
 * @date: 2023/9/3 18:19
 * @version: 1.0
 */
public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    protected IPayMode payMode;

    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    public abstract String transfer(String uId, String tradeId, BigDecimal amount);
}
