package com.higginsn.amazon.trees;

import com.higginsn.models.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/506/
 */
public class BinaryTreeLevelOrderTraversal {

    private List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return result;
        }
        helper(root, 0);
        return result;
    }

    private void helper(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (result.size() <= level) {
            List<Integer> newLevel = new ArrayList<>();
            newLevel.add(root.val);
            result.add(newLevel);
        } else {
            result.get(level).add(root.val);
        }

        helper(root.left, level + 1);
        helper(root.right, level + 1);
    }

}
