package com.higginsn.google.leetcode.algorithms.easy;

import com.higginsn.google.leetcode.algorithms.models.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/explore/learn/card/data-structure-tree/134/traverse-a-tree/930/
 * Given the root of a binary tree, return the postorder traversal of its nodes' values
 */
public class BinaryPostOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        leftStack.add(root);
        while (!leftStack.isEmpty()) {
            TreeNode node = leftStack.pop();
            rightStack.add(node);

            if (node.left != null) {
                leftStack.add(node.left);
            }

            if(node.right != null) {
                leftStack.add(node.right);
            }
        }

        while (!rightStack.isEmpty()) {
            result.add(rightStack.pop().val);
        }

        return result;
    }

}
