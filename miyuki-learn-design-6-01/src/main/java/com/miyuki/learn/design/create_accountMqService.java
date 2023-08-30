package com.miyuki.learn.design;

import com.alibaba.fastjson.JSON;
import com.miyuki.learn.design.mq.create_account;

/**
 * @author: miyuki
 * @description: 开户mq
 * @date: 2023/8/30 23:13
 * @version: 1.0
 */
public class create_accountMqService {

    public void onMessage(String message) {

        create_account mq = JSON.parseObject(message, create_account.class);

        mq.getNumber();
        mq.getAccountDate();

        // ... 处理自己的业务
    }
}
