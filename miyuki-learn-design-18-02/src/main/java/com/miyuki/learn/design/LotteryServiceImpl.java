package com.miyuki.learn.design;

import java.util.Date;

/**
 * @author: miyuki
 * @description: 实现类
 * @date: 2023/9/17 23:04
 * @version: 1.0
 */
public class LotteryServiceImpl extends LotteryService {

    private MinibusTargetService minibusTargetService = new MinibusTargetService();
    @Override
    protected LotteryResult doDraw(String uId) {
        // 摇号
        String lottery = minibusTargetService.lottery(uId);
        // 结果
        return new LotteryResult(uId, lottery, new Date());
    }
}
