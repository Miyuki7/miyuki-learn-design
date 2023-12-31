package com.miyuki.learn.design;

import java.math.BigDecimal;

/**
 * @author: miyuki
 * @description: 优惠接口类
 * @date: 2023/9/18 14:20
 * @version: 1.0
 */
public interface ICouponDiscount<T> {


    /**
     * 优惠券金额计算
     * @param couponInfo 券折扣信息；直减、满减、折扣、N元购
     * @param skuPrice   sku金额
     * @return           优惠后金额
     */
    BigDecimal discountAmount(T couponInfo, BigDecimal skuPrice);
}
