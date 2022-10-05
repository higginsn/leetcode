package com.higginsn.amazon.recursion;

import com.higginsn.models.Position;

import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/explore/interview/card/amazon/84/recursion/2989/
 */
public class WordSearch {

    private static final char VISITED = '_';
    private char[][] board;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                int index = 0;
                if (board[i][j] == word.charAt(index)) {
                    char temp = board[i][j];
                    board[i][j] = VISITED;
                    if (dfs(new Position(i, j), word, index + 1)) {
                        return true;
                    }
                    board[i][j] = temp;
                }


            }
        }

        return false;
    }

    private boolean dfs(Position position, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        List<Position> neighbors = position.possibleMovements().stream()
                .filter(this::isValid)
                .collect(Collectors.toList());

        for (Position neighbor : neighbors) {
            char character = board[neighbor.row][neighbor.col];
            if (character == VISITED) {
                continue;
            }
            if (character == word.charAt(index)) {
                board[neighbor.row][neighbor.col] = VISITED;
                if (dfs(neighbor, word, index + 1)) {
                    return true;
                }
                board[neighbor.row][neighbor.col] = character;
            }
        }
        return false;
    }

    private boolean isValid(Position position) {
        return position.row >= 0 && position.row < board.length
                && position.col >= 0 && position.col < board[0].length;

    }

}
