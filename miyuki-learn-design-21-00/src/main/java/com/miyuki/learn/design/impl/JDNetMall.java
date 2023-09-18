package com.miyuki.learn.design.impl;

import com.alibaba.fastjson.JSON;
import com.miyuki.learn.design.HttpClient;
import com.miyuki.learn.design.NetMall;
import org.apache.commons.codec.binary.Base64;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: miyuki
 * @description: jd商城
 * @date: 2023/9/18 15:01
 * @version: 1.0
 */
public class JDNetMall extends NetMall {
    public JDNetMall(String uId, String uPwd) {
        super(uId, uPwd);
    }

    @Override
    protected Boolean login(String uId, String uPwd) {
        logger.info("模拟京东用户登陆 uId: {} uPwd: {}", uId, uPwd);
        return true;
    }

    @Override
    protected Map<String, String> reptile(String skuUrl) {
        String str = HttpClient.doGet(skuUrl);
        Pattern p9 = Pattern.compile("(?<=title\\>).*(?=</title)");
        Matcher m9 = p9.matcher(str);
        Map<String, String> map = new ConcurrentHashMap<>();
        if (m9.find()) {
            map.put("name", m9.group());
        }
        map.put("price", "5999.00");
        logger.info("模拟京东商品爬虫解析：{} | {} 元 {}", map.get("name"), map.get("price"), skuUrl);
        return map;
    }

    @Override
    protected String createBase64(Map<String, String> goodsInfo) {
        logger.info("模拟生成京东商品base64海报");
        return Base64.encodeBase64String(JSON.toJSONString(goodsInfo).getBytes());    }
}
