package com.higginsn.amazon.trees;

import com.higginsn.models.Position;

import java.util.Stack;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/amazon/78/trees-and-graphs/894/
 */
public class NumberOfIslands {

    private static final char WATER = '0';
    private static final char LAND = '1';

    private char[][] map;

    public int numIslands(char[][] grid) {
        map = grid;
        int numberOfIslands = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == LAND) {
                    numberOfIslands++;
                    dfs(new Position(i, j));
                }
            }
        }
        return numberOfIslands;
    }

    // Set node to water, find neighbors and zero them out
    private void dfs(Position startingLandPosition) {
        Stack<Position> stack = new Stack<>();
        stack.add(startingLandPosition);

        while(!stack.isEmpty()) {
            Position position = stack.pop();
            char value = map[position.row][position.col];
            if (value == LAND) {
                map[position.row][position.col] = WATER;
                stack.addAll(position.possibleMovements().stream()
                        .filter(this::isValidPosition)
                        .collect(Collectors.toList()));
            }
        }
    }

    private boolean isValidPosition(Position position) {
        return position.row >= 0 && position.row < map.length
                && position.col >= 0 && position.col < map[0].length;
    }

}
