package com.higginsn.top100.graphs;

import com.higginsn.models.GraphNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/clone-graph/
 */
public class CloneGraph {

    private final Map<GraphNode, GraphNode> mapOfOldNodeToNew = new HashMap<>();

    public GraphNode cloneGraph(GraphNode node) {
        if (node == null) {
            return null;
        }

        Queue<GraphNode> queue = new LinkedList<>();
        queue.add(node);

        final Set<GraphNode> visited = new HashSet<>();
        while (!queue.isEmpty()) {
            // get the next node to visit
            GraphNode oldNode = queue.poll();
            visited.add(oldNode);

            // create a copy node and update relationship map above
            GraphNode newNode = new GraphNode(oldNode.val);
            mapOfOldNodeToNew.put(oldNode, newNode);

            // visit neighbors, filtering out those already visited
            queue.addAll(oldNode.neighbors.stream()
                    .filter(x -> !visited.contains(x))
                    .collect(Collectors.toList()));
        }

        visited.clear();

        queue.add(node);
        while (!queue.isEmpty()) {
            GraphNode oldNode = queue.poll();
            visited.add(oldNode);
            GraphNode newNode = mapOfOldNodeToNew.get(oldNode);

            for (GraphNode neighbor : oldNode.neighbors) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                }
                visited.add(neighbor);

                newNode.neighbors.add(mapOfOldNodeToNew.get(neighbor));
            }
        }

        return mapOfOldNodeToNew.get(node);
    }

}
