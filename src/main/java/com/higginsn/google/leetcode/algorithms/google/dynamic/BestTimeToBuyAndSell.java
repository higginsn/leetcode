package com.higginsn.google.leetcode.algorithms.google.dynamic;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 */
public class BestTimeToBuyAndSell {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int i = 1; i < prices.length; i++) {
            int newProfit = prices[i] - minPrice;
            maxProfit = Math.max(newProfit, maxProfit);

            minPrice = Math.min(minPrice, prices[i]);
        }

        return maxProfit;
    }

}
