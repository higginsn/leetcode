package com.higginsn.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        List<List<Node>> adjList = new ArrayList<>(Collections.nCopies(numCourses, new ArrayList<>()));

        for (int[] prereq : prereqs) {
            assert(prereq.length == 2);
            adjList.get(prereq[1]).add(new Node(prereq[0]));
        }

        for (int i = 0; i < adjList.size(); i++) {
            visitChildren(i, adjList);
        }


        return false;
    }

    private boolean visitChildren(int index, List<List<Node>> adjList) {
        for (Node edge : adjList.get(index)) {
            if (edge.visited) {
                return true;
            }

            edge.setVisited();
            visitChildren(edge.courseId, adjList);
        }
        return false; // how do you detect a cycle? a directed graph can have two edges pointing to the same node
        // and it wouldn't necessarily be a cycle
    }

}
