package com.higginsn.leetcode.algorithms.recursion;

/**
 * https://leetcode.com/problems/convert-binary-search-tree-to-sorted-doubly-linked-list/
 */
public class ConvertBSTToSortedDoublyLinkedList {

    Node head = null;
    Node tail = null;

    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }

        dfsHelper(root);
        head.left = tail;
        tail.right = head;
        return head;
    }

    private void dfsHelper(Node node) {
        if (node == null) {
            return;
        }

        dfsHelper(node.left);
        if (tail != null) {
            node.left = tail;
            tail.right = node;
        } else {
            head = node;
        }

        tail = node;
        dfsHelper(node.right);
    }

    private class Node {
        public int val;
        public Node left;
        public Node right;
    };

}
