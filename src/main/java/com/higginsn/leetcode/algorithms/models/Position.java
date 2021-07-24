package com.higginsn.leetcode.algorithms.models;

import java.util.List;

public class Position {
    public int row;
    public int col;

    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public List<Position> possibleMovements() {
        return List.of(new Position(row - 1, col), new Position(row + 1, col),
                new Position(row, col - 1), new Position(row, col + 1));
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Position p = (Position) o;
        return row == p.row && col == p.col;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.row;
        hash = 71 * hash + this.col;
        return hash;
    }
}
