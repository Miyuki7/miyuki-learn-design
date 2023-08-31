package com.miyuki.learn.design.cuisine.impl;

import com.miyuki.learn.design.OrderAdapterService;
import com.miyuki.learn.design.service.OrderService;

/**
 * @author: miyuki
 * @description: 内部商品接口
 * @date: 2023/8/31 23:23
 * @version: 1.0
 */
public class InsideOrderService implements OrderAdapterService {

    private OrderService orderService = new OrderService();
    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}
