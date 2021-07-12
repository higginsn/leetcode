package com.higginsn.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/course-schedule/
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array
 * prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take
 * course ai. Return true if you can finish all courses. Otherwise, return false. For example:
 * - The pair [0, 1] indicates that to take course 0 you have to first take course 1.
 */
public class CourseSchedule {

    private final class Node {
        int courseId;
        boolean visited;

        public Node(int courseId) {
            this.courseId = courseId;
            this.visited = false;
        }

        private void setVisited() {
            this.visited = true;
        }

    }

    public boolean canFinish(int numCourses, int[][] prereqs) {
        List<List<Node>> adjList = new ArrayList<>();
        IntStream.range(0, numCourses).forEach(i -> adjList.add(new ArrayList<>()));

        for (int[] prereq : prereqs) {
            assert(prereq.length == 2);
            adjList.get(prereq[1]).add(new Node(prereq[0]));
        }

        boolean success = true;
        boolean[] visited = new boolean[adjList.size()];
        for (int i = 0; i < adjList.size(); i++) {
            boolean[] visitedThisDFS = new boolean[adjList.size()];
            success = success && visitChildren(i, adjList, visited, visitedThisDFS);
        }

        return success;
    }

    private boolean visitChildren(int index, List<List<Node>> adjList, boolean[] visited, boolean[] visitedThisDFS) {
        if (visitedThisDFS[index]) {
            // Cycle found!
            return false;
        }
        visitedThisDFS[index] = true;

        for (Node node : adjList.get(index)) {
            if (visited[index]) {
                // This is to prune DFS so it does not get stuck in a loop anywhere
                return true;
            }

            visited[index] = true;
            boolean success = visitChildren(node.courseId, adjList, visited, visitedThisDFS);
            if (!success) {
                return false;
            }
        }
        return true;
    }

}
