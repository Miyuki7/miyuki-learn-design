package test;

import com.alibaba.fastjson.JSON;
import com.miyuki.learn.design.LotteryResult;
import com.miyuki.learn.design.LotteryService;
import com.miyuki.learn.design.LotteryServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test() {
        LotteryService lotteryService = new LotteryServiceImpl();
        LotteryResult result = lotteryService.draw("2765789109876");
        logger.info("测试结果：{}", JSON.toJSONString(result));
    }

}
