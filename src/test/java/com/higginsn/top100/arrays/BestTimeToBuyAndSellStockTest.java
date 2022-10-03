package com.higginsn.top100.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock sut = new BestTimeToBuyAndSellStock();

    @Test
    public void example1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int expected = 5;

        Assertions.assertEquals(expected, sut.maxProfit(prices));
    }

    @Test
    public void example2() {
        int[] prices = new int[]{7, 6, 4, 3, 1};
        int expected = 0;

        Assertions.assertEquals(expected, sut.maxProfit(prices));
    }

}