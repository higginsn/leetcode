package com.higginsn.easycollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockIITest {

    private final BestTimeToBuyAndSellStockII sut = new BestTimeToBuyAndSellStockII();

    @Test
    public void example1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 7;

        Assertions.assertEquals(expected, sut.maxProfit(prices));
    }

    @Test
    public void example2() {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        int expected = 4;

        Assertions.assertEquals(expected, sut.maxProfit(prices));
    }

    @Test
    public void example3() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int expected = 0;

        Assertions.assertEquals(expected, sut.maxProfit(prices));
    }
}