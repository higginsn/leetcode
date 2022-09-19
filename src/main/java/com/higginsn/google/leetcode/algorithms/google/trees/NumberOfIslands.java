package com.higginsn.google.leetcode.algorithms.google.trees;

import com.higginsn.google.leetcode.algorithms.models.Position;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/explore/interview/card/google/61/trees-and-graphs/3069/
 */
public class NumberOfIslands {

    private static final char WATER = '0';
    private static final char LAND = '1';

    public int numIslands(char[][] grid) {
        int islandCounter = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                Position position = new Position(row, col);
                if (grid[position.row][position.col] == WATER) {
                    continue;
                }

                islandCounter++;
                System.out.println(islandCounter);
                Queue<Position> queue = new LinkedList<>();
                queue.add(position);
                grid[position.row][position.col] = WATER;
                while (!queue.isEmpty()) {
                    Position nextPos = queue.poll();
                    nextPos.possibleMovements().stream()
                            .filter(pos -> isValidPosition(pos, grid))
                            .filter(pos -> grid[pos.row][pos.col] == LAND)
                            .forEach(pos -> {
                                grid[pos.row][pos.col] = WATER;
                                queue.offer(pos);
                            });
                }
            }
        }

        return islandCounter;
    }

    private boolean isValidPosition(Position position, char[][] grid) {
        return position.row >= 0 && position.row < grid.length
                && position.col >= 0 && position.col < grid[0].length;
    }

}
