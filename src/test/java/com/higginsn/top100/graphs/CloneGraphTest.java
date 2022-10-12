package com.higginsn.top100.graphs;

import com.higginsn.models.GraphNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class CloneGraphTest {

    private final CloneGraph sut = new CloneGraph();

    @Test
    public void example1() {
        GraphNode one = new GraphNode(1);
        GraphNode two = new GraphNode(2);
        GraphNode three = new GraphNode(3);
        GraphNode four = new GraphNode(4);

        one.neighbors.addAll(Arrays.asList(two, four));
        two.neighbors.addAll(Arrays.asList(one, three));
        three.neighbors.addAll(Arrays.asList(two, four));
        four.neighbors.addAll(Arrays.asList(one, three));

        Assertions.assertEquals(one, sut.cloneGraph(one));
    }

    @Test
    public void example2() {
        GraphNode one = new GraphNode(1);

        Assertions.assertEquals(one, sut.cloneGraph(one));
    }

    @Test
    public void example3() {
        Assertions.assertNull(sut.cloneGraph(null));
    }
}