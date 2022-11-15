package com.higginsn.amazon.grokking.bfs;

import com.higginsn.models.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/m2N6GwARL8r
 */
public class ReverseLevelOrderTraversal {

    public static List<List<Integer>> traverse(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> row = new ArrayList<>();
            for (int i = queue.size(); i > 0; i--) {
                TreeNode node = queue.poll();
                row.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(0, row);
        }

        return result;
    }

}
