package com.miyuki.learn.design.model.aggregates;

import com.miyuki.learn.design.model.vo.TreeNode;
import com.miyuki.learn.design.model.vo.TreeRoot;

import java.util.Map;

/**
 * @author: miyuki
 * @description: 规则树聚合
 * @date: 2023/9/3 20:27
 * @version: 1.0
 */
public class TreeRich {

    private TreeRoot treeRoot; //树根信息

    private Map<Long, TreeNode> treeNodeMap; //树节点ID -> 子节点

    public TreeRich(TreeRoot treeRoot, Map<Long, TreeNode> treeNodeMap) {
        this.treeRoot = treeRoot;
        this.treeNodeMap = treeNodeMap;
    }

    public TreeRoot getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(TreeRoot treeRoot) {
        this.treeRoot = treeRoot;
    }

    public Map<Long, TreeNode> getTreeNodeMap() {
        return treeNodeMap;
    }

    public void setTreeNodeMap(Map<Long, TreeNode> treeNodeMap) {
        this.treeNodeMap = treeNodeMap;
    }
}
