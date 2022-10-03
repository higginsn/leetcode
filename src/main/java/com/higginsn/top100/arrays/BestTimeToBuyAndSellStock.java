package com.higginsn.top100.arrays;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int buy = prices[0];
        int sell = 0;
        int maxDiff = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
                sell = 0;
            } else if (prices[i] > sell) {
                sell = prices[i];
                maxDiff = Math.max(sell - buy, maxDiff);
            }
        }
        return maxDiff;
    }
}
