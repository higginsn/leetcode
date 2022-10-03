package com.higginsn.amazon.linkedlists;

import com.higginsn.models.Node;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/explore/interview/card/amazon/77/linked-list/2978/
 */
public class CopyListWithRandomPointer {

    private Map<Node, Node> mapOfOldToNew = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }

        Node newHead = new Node(head.val);
        Node result = newHead;
        mapOfOldToNew.put(head, newHead);
        Node iterator = head.next;
        while (iterator != null) {
            Node newNode = new Node(iterator.val);
            newHead.next = newNode;
            newHead = newNode;
            mapOfOldToNew.put(iterator, newNode);
            iterator = iterator.next;
        }

        newHead = result;
        while (newHead != null && head != null) {
            if (head.random != null) {
                newHead.random = mapOfOldToNew.get(head.random);
            }
            newHead = newHead.next;
            head = head.next;
        }
        return result;
    }

}
