package com.miyuki.learn.design.test;

import com.miyuki.learn.design.CacheService;
import com.miyuki.learn.design.factory.JDKProxy;
import com.miyuki.learn.design.factory.impl.EGMCacheAdapter;
import com.miyuki.learn.design.factory.impl.IIRCacheAdapter;
import com.miyuki.learn.design.impl.CacheServiceImpl;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_CacheService() {
        CacheService proxy_EGM = JDKProxy.getProxy(CacheServiceImpl.class, new EGMCacheAdapter());
        proxy_EGM.set("user_name_01", "miyuki");
        String val01 = proxy_EGM.get("user_name_01");
        System.out.println("测试结果：" + val01);

        CacheService proxy_IIR = JDKProxy.getProxy(CacheServiceImpl.class, new IIRCacheAdapter());
        proxy_IIR.set("user_name_01", "miyuki");
        String val02 = proxy_IIR.get("user_name_01");
        System.out.println("测试结果：" + val02);
    }
}
