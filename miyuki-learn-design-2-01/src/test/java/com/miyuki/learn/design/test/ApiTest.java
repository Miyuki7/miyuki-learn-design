package com.miyuki.learn.design.test;

import com.miyuki.learn.design.CacheService;
import com.miyuki.learn.design.cuisine.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheService() {

        CacheService cacheService = new CacheServiceImpl();

        cacheService.set("user_name_01", "miyuki", 1);
        String val01 = cacheService.get("user_name_01", 1);
        System.out.println("测试结果：" + val01);

    }
}
