package com.higginsn.top100.graphs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphValidTreeTest {

    private final GraphValidTree sut = new GraphValidTree();

    @Test
    public void example1() {
        int n = 5;
        int[][] edges = new int[][]{
                {0, 1},
                {0, 2},
                {0, 3},
                {1, 4}
        };

        Assertions.assertTrue(sut.validTree(n, edges));
    }

    @Test
    public void example2() {
        int n = 5;
        int[][] edges = new int[][]{
                {0, 1},
                {1, 2},
                {2, 3},
                {1, 3},
                {1, 4}
        };

        Assertions.assertFalse(sut.validTree(n, edges));
    }
}