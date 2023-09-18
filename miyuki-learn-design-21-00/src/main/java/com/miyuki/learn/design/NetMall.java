package com.miyuki.learn.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author: miyuki
 * @description: 抽象类
 * @date: 2023/9/18 14:53
 * @version: 1.0
 */
public abstract class NetMall {

    protected Logger logger = LoggerFactory.getLogger(NetMall.class);

    String uId;   // 用户ID
    String uPwd;  // 用户密码

    public NetMall(String uId, String uPwd) {
        this.uId = uId;
        this.uPwd = uPwd;
    }


    public String generateGoodsPoster(String skuUrl) {
        if (!login(uId, uPwd)) return null; // 1. 验证登陆
        Map<String, String> reptile = reptile(skuUrl); //2. 爬虫商品
        return createBase64(reptile); //3. 组装海报
    }
    protected abstract Boolean login(String uId, String uPwd);

    // 爬虫提取商品信息(登录后的优惠价格)
    protected abstract Map<String, String> reptile(String skuUrl);

    // 生成商品海报信息
    protected abstract String createBase64(Map<String, String> goodsInfo);
}
