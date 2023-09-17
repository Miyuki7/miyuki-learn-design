package com.miyuki.learn.design.event.listener;

import com.miyuki.learn.design.LotteryResult;

/**
 * @author: miyuki
 * @description: 事件监听接口定义
 * @date: 2023/9/17 22:27
 * @version: 1.0
 */
public interface EventListener {

    void doEvent(LotteryResult result);
}
