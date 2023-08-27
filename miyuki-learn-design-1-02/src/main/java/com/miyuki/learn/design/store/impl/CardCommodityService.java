package com.miyuki.learn.design.store.impl;

import com.alibaba.fastjson.JSON;
import com.miyuki.learn.design.card.IQIYiCardService;
import com.miyuki.learn.design.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CardCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CardCommodityService.class);

    private IQIYiCardService iqiYiCardService = new IQIYiCardService();
    @Override
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        String mobile = queryUserMobile(uId);
        iqiYiCardService.grantToken(mobile, bizId);
        logger.info("请求参数[爱奇艺兑换卡] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[爱奇艺兑换卡]：success");
    }
    private String queryUserMobile(String uId) {
        return "15200101232";
    }

}
