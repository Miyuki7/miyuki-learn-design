package com.miyuki.learn.design.service.engine.impl;

import com.miyuki.learn.design.model.aggregates.TreeRich;
import com.miyuki.learn.design.model.vo.EngineResult;
import com.miyuki.learn.design.model.vo.TreeNode;
import com.miyuki.learn.design.service.engine.EngineBase;

import java.util.Map;

/**
 * @author: miyuki
 * @description: 决策引擎的实现
 * @date: 2023/9/3 21:38
 * @version: 1.0
 */
public class TreeEngineHandle extends EngineBase {
    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        //决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        //决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
