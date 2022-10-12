package com.higginsn.models;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode() {
        this(0);
    }

    public GraphNode(int _val) {
        this(_val, new ArrayList<>());
    }

    public GraphNode(int _val, ArrayList<GraphNode> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        GraphNode t = (GraphNode) o;

        if ((val != t.val) || (neighbors.size() != t.neighbors.size())) {
            return false;
        }

        for (int i = 0; i < neighbors.size(); i++) {
            if (neighbors.get(i).val != t.neighbors.get(i).val) {
                return false;
            }
        }
        return true;
    }

}
