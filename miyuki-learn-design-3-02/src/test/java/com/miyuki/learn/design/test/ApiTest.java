package com.miyuki.learn.design.test;

import com.miyuki.learn.design.Builder;
import org.junit.Test;

/**
 * @author: miyuki
 * @description: 建造者模式测试
 * @date: 2023/8/29 22:44
 * @version: 1.0
 */
public class ApiTest {

    @Test
    public void test_Builder() {
        Builder builder = new Builder();

        System.out.println(builder.levelOne(132.52D).getDetail());

        // 轻奢田园
        System.out.println(builder.levelTwo(98.25D).getDetail());

        // 现代简约
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
