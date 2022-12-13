package com.higginsn.easycollection;

/**
 * https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/564/
 */
public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        if (prices.length <= 1) {
            return 0;
        }

        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            int sellPrice = prices[i];
            if (sellPrice > buyPrice) {
                profit += sellPrice - buyPrice;
            }
            buyPrice = sellPrice;
        }


        return profit;
    }

}
