package com.miyuki.learn.design;

import com.miyuki.learn.design.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: miyuki
 * @description: ifelse实现
 * @date: 2023/9/4 23:22
 * @version: 1.0
 */
public class HelloWorldController {

    public UserInfo queryUserInfo(@RequestParam String userId) {

        // 做白名单拦截
        List<String> userList = new ArrayList<String>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");
        if (!userList.contains(userId)) {
            return new UserInfo("1111", "非白名单可访问用户拦截！");
        }

        return new UserInfo("虫虫:" + userId, 19, "天津市南开区旮旯胡同100号");
    }
}
