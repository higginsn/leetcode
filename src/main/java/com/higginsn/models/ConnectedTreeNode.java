package com.higginsn.models;

import java.util.Objects;

public class ConnectedTreeNode extends TreeNode {
    public TreeNode next;

    public ConnectedTreeNode(int val) {
        super(val);
    }

    public ConnectedTreeNode(int val, TreeNode next) {
        super(val, null, null);
        this.next = next;
    }

    public ConnectedTreeNode(int val, TreeNode left, TreeNode right) {
        super(val, left, right);
    }

    public ConnectedTreeNode(int val, TreeNode left, TreeNode right, TreeNode next) {
        super(val, left, right);
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ConnectedTreeNode t = (ConnectedTreeNode) o;

        return super.equals(t)
                && Objects.equals(next, t.next);
    }

}
