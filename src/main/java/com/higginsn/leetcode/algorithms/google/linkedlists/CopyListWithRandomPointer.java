package com.higginsn.leetcode.algorithms.google.linkedlists;

import com.higginsn.leetcode.algorithms.models.Node;

/**
 * https://leetcode.com/problems/copy-list-with-random-pointer/
 */
public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node iterator = head;
        while (iterator != null) {
            Node copyNode = new Node(iterator.val);
            copyNode.next = iterator.next;
            iterator.next = copyNode;
            iterator = copyNode.next;
        }

        iterator = head;
        while (iterator != null) {
            Node randomNode = iterator.random == null ? null : iterator.random.next;
            iterator = iterator.next;
            iterator.random = randomNode;
            iterator = iterator.next;
        }

        iterator = head;
        Node result = head.next;
        Node resultIterator = result;
        while (iterator != null) {
            iterator.next = iterator.next.next;
            resultIterator.next = resultIterator.next != null ? resultIterator.next.next : null;
            iterator = iterator.next;
            resultIterator = resultIterator.next;
        }

        return result;
    }

}
