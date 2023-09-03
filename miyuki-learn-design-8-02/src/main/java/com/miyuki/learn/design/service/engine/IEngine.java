package com.miyuki.learn.design.service.engine;

import com.miyuki.learn.design.model.aggregates.TreeRich;
import com.miyuki.learn.design.model.vo.EngineResult;

import java.util.Map;

/**
 * @author: miyuki
 * @description: 决策引擎接口定义
 * @date: 2023/9/3 21:07
 * @version: 1.0
 */
public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);
}
