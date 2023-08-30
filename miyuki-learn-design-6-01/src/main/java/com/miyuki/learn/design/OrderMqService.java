package com.miyuki.learn.design;

import com.alibaba.fastjson.JSON;
import com.miyuki.learn.design.mq.OrderMq;

/**
 * @author: miyuki
 * @description: 订单mq
 * @date: 2023/8/30 23:14
 * @version: 1.0
 */
public class OrderMqService {

    public void onMessage(String message) {

        OrderMq mq = JSON.parseObject(message, OrderMq.class);

        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        // ... 处理自己的业务
    }
}
