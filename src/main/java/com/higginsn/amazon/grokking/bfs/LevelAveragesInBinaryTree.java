package com.higginsn.amazon.grokking.bfs;

import com.higginsn.models.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * https://www.educative.io/courses/grokking-the-coding-interview/YQWkA2l67GW
 */
public class LevelAveragesInBinaryTree {

    public static List<Double> findLevelAverages(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        List<Double> result = new ArrayList<>();

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            double avg = 0.0;
            int levelWidth = queue.size();
            for (int i = levelWidth; i > 0; i--) {
                TreeNode node = queue.poll();
                avg += node.val;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            result.add(avg / levelWidth);
        }

        return result;
    }

}
