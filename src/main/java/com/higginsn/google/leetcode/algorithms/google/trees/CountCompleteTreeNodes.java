package com.higginsn.google.leetcode.algorithms.google.trees;

import com.higginsn.models.TreeNode;

/**
 * https://leetcode.com/explore/interview/card/google/61/trees-and-graphs/3071/
 */
public class CountCompleteTreeNodes {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }


        int depth = computeDepth(root);
        if (depth == 0) {
            return 1;
        }

        int left = 1;
        int right = (int) Math.pow(2, depth) - 1;
        int pivot;

        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (exists(pivot, depth, root)) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return (int) Math.pow(2, depth) - 1 + left;
    }

    private boolean exists(int index, int depth, TreeNode root) {
        int left = 0;
        int right = (int) Math.pow(2, depth) - 1;
        int pivot;

        for (int i = 0; i < depth; ++i) {
            pivot = left + (right - left) / 2;
            if (pivot >= index) {
                root = root.left;
                right = pivot;
            } else {
                root = root.right;
                left = pivot + 1;
            }
        }
        return root != null;
    }


    private int computeDepth(TreeNode root) {
        int depth = -1;
        TreeNode ptr = root;
        while (ptr != null) {
            ptr = ptr.left;
            depth++;
        }

        return depth;
    }

}
