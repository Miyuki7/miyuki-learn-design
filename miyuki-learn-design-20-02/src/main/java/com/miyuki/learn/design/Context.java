package com.miyuki.learn.design;

import java.math.BigDecimal;

/**
 * @author: miyuki
 * @description: 策略控制类
 * @date: 2023/9/18 14:30
 * @version: 1.0
 */
public class Context<T> {

    private ICouponDiscount<T> couponDiscount;

    public Context(ICouponDiscount<T> couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    public BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice) {
        return couponDiscount.discountAmount(couponInfo, skuPrice);
    }
}
