package com.miyuki.learn.design.service.logic;

import com.miyuki.learn.design.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author: miyuki
 * @description: 树节点逻辑过滤器接口
 * @date: 2023/9/3 20:33
 * @version: 1.0
 */
public interface LogicFilter {

    /**
     * @param matterValue: 决策值
     * @param treeNodeLineInfoList: 决策节点
     * @return java.lang.Long 下一个节点ID
     * @author miyuki
     * @description 逻辑决策器
     * @date 2023/9/3 20:38
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);

    /**
     * @param treeId:
     * @param userId:
     * @param decisionMatter: 决策物料
     * @return java.lang.String 决策值
     * @author miyuki
     * @description 获取决策值
     * @date 2023/9/3 20:40
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);
}
