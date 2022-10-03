package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/2980/
 */
public class BinaryTreeZigzagLevelOrderTraversal {

    private List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        if (result.size() <= level) {
            List<Integer> newLevel = new LinkedList<>();
            newLevel.add(node.val);
            result.add(newLevel);
        } else if (level % 2 == 0) {
            result.get(level).add(node.val);
        } else {
            result.get(level).add(0, node.val);
        }

        helper(node.left, level + 1);
        helper(node.right, level + 1);
    }

}
