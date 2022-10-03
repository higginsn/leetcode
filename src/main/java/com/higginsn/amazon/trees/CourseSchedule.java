package com.higginsn.amazon.trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/2983/
 */
public class CourseSchedule {

    private Map<Integer, List<Integer>> requisiteGraph = new HashMap<>();

    // numCourses = sequential course IDs from 0 to numCourses - 1
    // prerequisites = list of pairs where the latter course is the requirement for taking the former course
    // e.g. [1, 0] means you must take course 0 before course 1
    public boolean canFinish(int numCourses, int[][] prerequisites) {

        for (int[] prerequisite : prerequisites) {
            requisiteGraph.computeIfAbsent(prerequisite[0], x -> new ArrayList<>()).add(prerequisite[1]);
        }

        for (int i = 0; i < numCourses; i++) {
            return dfs(i, new HashSet<>(Arrays.asList(i)));
        }

        // Create a graph of reqs. Likely in a Map<Course, List<Prereqs>>.
        // Goal is to determine if there's a circular dependency, or a cycle in the graph.
        // For course : num courses:
        //    perform DFS on node
        //    if cycle found, return false. otherwise continue


        return true;
    }

    private boolean dfs(int nextNode, Set<Integer> visited) {
        List<Integer> neighbors = requisiteGraph
                .getOrDefault(nextNode, Collections.emptyList());
        for (int neighbor : neighbors) {
            if (visited.contains(neighbor)) {
                return false;
            }
            visited.add(neighbor);
            if (dfs(neighbor, visited) == false) {
                return false;
            }
            visited.remove(neighbor);
        }
        return true;
    }

}
