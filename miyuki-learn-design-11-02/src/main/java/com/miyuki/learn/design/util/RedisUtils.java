package com.miyuki.learn.design.util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: miyuki
 * @description: 定时减库存
 * @date: 2023/9/10 23:05
 * @version: 1.0
 */
public class RedisUtils {

    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private AtomicInteger stock = new AtomicInteger(0);

    public RedisUtils() {
        scheduledExecutorService.scheduleAtFixedRate(() -> {
            stock.addAndGet(1);
        }, 0, 100000, TimeUnit.MICROSECONDS);
    }

    public int getStockUsed() {
        return stock.get();
    }
}
