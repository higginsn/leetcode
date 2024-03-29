package com.higginsn.google.leetcode.algorithms.stacks;

import com.higginsn.models.Position;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/learn/card/queue-stack/231/practical-application-queue/1373/
 */
public class WallsAndGates {

    private static final int GATE = 0;
    private static final int EMPTY = 2147483647;

    public void wallsAndGates(int[][] rooms) {

        Queue<Position> queue = new LinkedList<>();
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j] == GATE) {
                    queue.offer(new Position(i, j));
                }
            }
        }

        int level = 0;
        while (!queue.isEmpty()) {
            level++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Position room = queue.poll();

                List<Position> possibilities = room.possibleMovements().stream()
                        .filter(position -> isValidPosition(position, rooms))
                        .collect(Collectors.toList());
                for (Position position : possibilities) {
                    rooms[position.row][position.col] = level;
                    queue.offer(position);
                }
            }
        }
    }

    private boolean isValidPosition(Position position, int[][] rooms) {
        return position.row >= 0 && position.row < rooms.length
                && position.col >= 0 && position.col < rooms[0].length
                && rooms[position.row][position.col] == EMPTY;
    }

}
