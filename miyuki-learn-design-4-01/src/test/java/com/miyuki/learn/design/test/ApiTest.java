package com.miyuki.learn.design.test;

import com.miyuki.learn.design.QuestionBankController;
import org.junit.Test;

/**
 * @author: miyuki
 * @description: 未使用原型模式测试
 * @date: 2023/8/29 23:18
 * @version: 1.0
 */
public class ApiTest {

    @Test
    public void test_QuestionBankController() {
        QuestionBankController questionBankController = new QuestionBankController();
        System.out.println(questionBankController.createPaper("花花", "1000001921032"));
        System.out.println(questionBankController.createPaper("豆豆", "1000001921051"));
        System.out.println(questionBankController.createPaper("大宝", "1000001921987"));
    }
}
