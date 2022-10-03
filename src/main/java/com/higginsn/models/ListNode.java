package com.higginsn.models;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int... values) {
        assert(values.length > 0);

        ListNode head = null;
        int[] array = Arrays.stream(values).toArray();
        for (int i = array.length - 1; i >= 0; i--) {
            head = new ListNode(array[i], head);
        }

        this.val = head.val;
        this.next = head.next;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ListNode t = (ListNode) o;

        return val == t.val
                && Objects.equals(next, t.next);
    }

}
