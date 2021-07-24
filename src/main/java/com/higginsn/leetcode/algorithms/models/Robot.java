package com.higginsn.leetcode.algorithms.models;

/**
 * This is the robot's control interface. Do not implement it or speculate about its implementation.
 */
public interface Robot {

    // Returns true if the cell in front is open and robot moves into the cell
    // Returns false if the cell in front is blocked and robot stays in the current cell
    public boolean move();

    // Robot will stay in the same cell after calling turn methods. Each turn will rotate the robot 90 degrees.
    public void turnLeft();
    public void turnRight();

    // Clean the current cell
    public void clean();

}
