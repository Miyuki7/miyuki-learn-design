package com.miyuki.learn.design.event.listener;

import com.miyuki.learn.design.LotteryResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: miyuki
 * @description: 短消息事件
 * @date: 2023/9/17 22:29
 * @version: 1.0
 */
public class MessageEventListener implements EventListener {

    private Logger logger = LoggerFactory.getLogger(MessageEventListener.class);
    @Override
    public void doEvent(LotteryResult result) {
        logger.info("给用户 {} 发送短信通知(短信): {}", result.getuId(), result.getMsg());
    }
}
