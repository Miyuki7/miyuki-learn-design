package com.miyuki.learn.design.service.logic;

import com.miyuki.learn.design.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

/**
 * @author: miyuki
 * @description: 决策抽象类提供基础服务
 * @date: 2023/9/3 20:48
 * @version: 1.0
 */
public class BaseLogic implements LogicFilter{
    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList) {
        for (TreeNodeLink nodeLine : treeNodeLineInfoList) {
            if (decisionLogic(matterValue, nodeLine)) {
                return nodeLine.getNodeIdTo();
            }
        }
        return 0L;
    }

    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return null;
    }

    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
