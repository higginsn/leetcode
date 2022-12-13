package com.higginsn.mediumcollection;

import com.higginsn.models.ConnectedTreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PopulatingNextRightPointerInEachNodeTest {

    private final PopulatingNextRightPointerInEachNode sut = new PopulatingNextRightPointerInEachNode();

    @Test
    public void example1() {
        ConnectedTreeNode four = new ConnectedTreeNode(4);
        ConnectedTreeNode five = new ConnectedTreeNode(5);
        ConnectedTreeNode six = new ConnectedTreeNode(6);
        ConnectedTreeNode seven = new ConnectedTreeNode(7);

        ConnectedTreeNode two = new ConnectedTreeNode(2, four, five);
        ConnectedTreeNode three = new ConnectedTreeNode(3, six, seven);
        ConnectedTreeNode root = new ConnectedTreeNode(1, two, three);

        ConnectedTreeNode sevenExpected = new ConnectedTreeNode(7);
        ConnectedTreeNode sixExpected = new ConnectedTreeNode(6, seven);
        ConnectedTreeNode fiveExpected = new ConnectedTreeNode(5, six);
        ConnectedTreeNode fourExpected = new ConnectedTreeNode(4, five);

        ConnectedTreeNode threeExpected = new ConnectedTreeNode(3, sixExpected, sevenExpected);
        ConnectedTreeNode twoExpected = new ConnectedTreeNode(2, fourExpected, fiveExpected, three);
        ConnectedTreeNode expected = new ConnectedTreeNode(1, twoExpected, threeExpected);

        Assertions.assertEquals(expected, sut.connect(root));
    }

    @Test
    public void example2() {
        Assertions.assertNull(sut.connect(null));
    }

}