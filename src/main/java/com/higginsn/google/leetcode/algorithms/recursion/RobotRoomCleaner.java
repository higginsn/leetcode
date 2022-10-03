package com.higginsn.google.leetcode.algorithms.recursion;

import com.higginsn.models.Position;
import com.higginsn.models.Robot;

import java.util.HashSet;
import java.util.Set;

public class RobotRoomCleaner {

    // 0 == up, 1 == right, 2 == down, 3 == left
    private static final int[][] DIRECTIONS = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    private Robot robot;
    private Set<Position> visited;

    public void cleanRoom(Robot robot) {
        this.robot = robot;
        this.visited = new HashSet<>();
        backtrack(new Position(0, 0), 0);
    }

    private void backtrack(Position currentPosition, int direction) {
        robot.clean();
        visited.add(currentPosition);
        System.out.println(currentPosition.row + " " + currentPosition.col);

        for (int i = 0; i < 4; i++) {
            int newDirection = (direction + i) % 4;
            int newRow = currentPosition.row + DIRECTIONS[newDirection][0];
            int newCol = currentPosition.col + DIRECTIONS[newDirection][1];
            Position newPosition = new Position(newRow, newCol);

            if (!visited.contains(newPosition) && robot.move()) {
                backtrack(newPosition, newDirection);
                goBack();
            }

            robot.turnRight();
        }
    }

    private void goBack() {
        robot.turnRight();
        robot.turnRight();
        robot.move();
        robot.turnRight();
        robot.turnRight();
    }

}
