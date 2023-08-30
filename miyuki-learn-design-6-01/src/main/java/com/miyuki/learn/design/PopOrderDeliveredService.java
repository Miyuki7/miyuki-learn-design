package com.miyuki.learn.design;

import com.alibaba.fastjson.JSON;
import com.miyuki.learn.design.mq.POPOrderDelivered;

/**
 * @author: miyuki
 * @description: 第三方订单MQ
 * @date: 2023/8/30 23:15
 * @version: 1.0
 */
public class PopOrderDeliveredService {

    public void onMessage(String message) {

        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);

        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        // ... 处理自己的业务
    }
}
