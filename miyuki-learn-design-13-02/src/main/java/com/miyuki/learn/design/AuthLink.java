package com.miyuki.learn.design;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: miyuki
 * @description: 链路抽象类定义
 * @date: 2023/9/11 22:16
 * @version: 1.0
 */
public abstract class AuthLink {

    protected Logger logger = LoggerFactory.getLogger(AuthLink.class);

    protected SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    protected String levelUserId; //级别人员ID
    protected String levelUserName;
    private AuthLink next;
    public AuthLink(String levelUserId, String levelUserName) {
        this.levelUserId = levelUserId;
        this.levelUserName = levelUserName;
    }
    public AuthLink next() {
        return next;
    }

    public AuthLink appendNext(AuthLink next) {
        this.next = next;
        return this;
    }
    public abstract AuthInfo doAuth(String uId, String orderId, Date authData);
}
