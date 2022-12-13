package com.higginsn.mediumcollection;

import com.higginsn.models.ConnectedTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/explore/interview/card/top-interview-questions-medium/108/trees-and-graphs/789/
 */
public class PopulatingNextRightPointerInEachNode {

    // input: a perfect binary tree
    // output: a perfect binary tree with it's "next" pointer defined
    public ConnectedTreeNode connect(ConnectedTreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<ConnectedTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ConnectedTreeNode nextNode = null;
            for (int i = queue.size(); i > 0; i--) {
                if (nextNode == null) {
                    nextNode = queue.poll();
                } else {
                    ConnectedTreeNode previousNode = queue.poll();
                    previousNode.next = nextNode;
                    nextNode = previousNode;
                }

                if (nextNode.right != null) {
                    queue.add((ConnectedTreeNode) nextNode.right);
                }
                if (nextNode.left != null) {
                    queue.add((ConnectedTreeNode) nextNode.left);
                }
            }
        }

        return root;
    }

}
