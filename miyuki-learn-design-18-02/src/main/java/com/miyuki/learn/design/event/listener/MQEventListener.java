package com.miyuki.learn.design.event.listener;

import com.miyuki.learn.design.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: miyuki
 * @description: MQ发送事件
 * @date: 2023/9/17 22:36
 * @version: 1.0
 */
public class MQEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MQEventListener.class);

    @Override
    public void doEvent(LotteryResult result) {
        logger.info("记录用户 {} 摇号结果(MQ)：{}", result.getuId(), result.getMsg());
    }
}
