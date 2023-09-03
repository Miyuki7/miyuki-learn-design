package com.miyuki.learn.design.service.engine;

import com.miyuki.learn.design.service.logic.LogicFilter;
import com.miyuki.learn.design.service.logic.impl.UserAgeFilter;
import com.miyuki.learn.design.service.logic.impl.UserGenderFilter;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: miyuki
 * @description: 决策节点配置
 * @date: 2023/9/3 21:09
 * @version: 1.0
 */
public class EngineConfig {

    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap) {
        this.logicFilterMap = logicFilterMap;
    }
}
