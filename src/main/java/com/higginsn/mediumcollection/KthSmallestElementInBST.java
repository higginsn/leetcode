package com.higginsn.mediumcollection;

import com.higginsn.models.TreeNode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/790/
 */
public class KthSmallestElementInBST {

    public int kthSmallest(TreeNode root, int k) {
        if (root == null) {
            return -1;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            priorityQueue.add(node.val);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        return priorityQueue.peek();
    }

}
