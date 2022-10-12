package com.higginsn.top100.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * https://leetcode.com/problems/graph-valid-tree/description/
 */
public class GraphValidTree {

    public boolean validTree(int n, int[][] edges) {
        if (edges.length != (n - 1)) {
            return false;
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(edge[1]);
            graph.computeIfAbsent(edge[1], x -> new ArrayList<>()).add(edge[0]);
        }

        if (graph.size() != n) {
            return false;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()) {
            Integer node = queue.poll();
            queue.addAll(graph.getOrDefault(node, Collections.emptyList()));
            graph.remove(node);
        }

        return graph.isEmpty();
    }

}
