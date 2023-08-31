package com.miyuki.learn.design.cuisine.impl;

import com.miyuki.learn.design.OrderAdapterService;
import com.miyuki.learn.design.service.POPOrderService;

/**
 * @author: miyuki
 * @description: 第三方商品接口
 * @date: 2023/8/31 23:25
 * @version: 1.0
 */
public class PopOrderAdapterServiceImpl implements OrderAdapterService {

    private POPOrderService popOrderService = new POPOrderService();
    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}
