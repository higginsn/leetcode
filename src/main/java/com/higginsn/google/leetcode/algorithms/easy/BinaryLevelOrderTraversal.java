package com.higginsn.google.leetcode.algorithms.easy;

import com.higginsn.google.leetcode.algorithms.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/930/
 * Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right,
 * level by level)
 */
public class BinaryLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> levelValue = new ArrayList<>();
            Queue<TreeNode> newQueue = new LinkedList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                levelValue.add(node.val);
                if (node.left != null) {
                    newQueue.add(node.left);
                }

                if (node.right != null) {
                    newQueue.add(node.right);
                }
            }
            queue = newQueue;
            result.add(levelValue);
        }

        return result;
    }

}
