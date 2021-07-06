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

}