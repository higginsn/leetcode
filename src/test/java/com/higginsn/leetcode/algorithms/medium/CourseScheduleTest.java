package com.higginsn.leetcode.algorithms.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CourseScheduleTest {

    private final CourseSchedule sut = new CourseSchedule();

    @Test
    public void example1() {
        int numCourses = 2;
        int[][] prereqs = new int[][]{{1, 0}};
        Assertions.assertTrue(sut.canFinish(numCourses, prereqs));
    }

    @Test
    public void example2() {
        int numCourses = 2;
        int[][] prereqs = new int[][]{{1, 0}, {0, 1}};
        Assertions.assertFalse(sut.canFinish(numCourses, prereqs));
    }

    @Test
    public void example3() {
        int numCourses = 4;
        int[][] prereqs = new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        Assertions.assertTrue(sut.canFinish(numCourses, prereqs));
    }

    @Test
    public void example4() {
        int numCourses = 3;
        int[][] prereqs = new int[][]{{0, 1}, {0, 2}, {1, 2}};
        Assertions.assertTrue(sut.canFinish(numCourses, prereqs));
    }

    @Test
    public void example5() {
        int numCourses = 4;
        int[][] prereqs = new int[][]{{2, 0}, {1, 0}, {3, 1}, {3, 2}, {1, 3}};
        Assertions.assertFalse(sut.canFinish(numCourses, prereqs));
    }

    @Test
    public void example6() {
        int numCourses = 3;
        int prereqs[][] = new int[][]{{1, 0}, {2, 0}, {0, 2}};
        Assertions.assertFalse(sut.canFinish(numCourses, prereqs));
    }

    @Test
    public void example7() {
        int numCourses = 4;
        int prereqs[][] = new int[][]{{0, 1}, {3, 1}, {1, 3}, {3, 2}};
        Assertions.assertFalse(sut.canFinish(numCourses, prereqs));
    }

}