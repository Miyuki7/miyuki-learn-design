package com.miyuki.learn.design.service.logic.impl;

import com.miyuki.learn.design.service.logic.BaseLogic;

import java.util.Map;

/**
 * @author: miyuki
 * @description: 年龄节点
 * @date: 2023/9/3 21:00
 * @version: 1.0
 */
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }
}
