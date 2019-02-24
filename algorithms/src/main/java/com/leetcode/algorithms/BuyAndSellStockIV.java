package com.leetcode.algorithms;

/**
  */
public class BuyAndSellStockIV {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        if (k >= prices.length / 2) {
            int maxProfit = 0;
            for(int i = 1; i < prices.length; i++) {
                if(prices[i] > prices[i-1]) {
                    maxProfit+= prices[i] - prices[i-1];
                }
            }
            return maxProfit;
        } else {
            // maxProfit[i][j]: max profit for up to i transactions by time j.
            int[][] maxProfit = new int[k + 1][prices.length];

            for (int i = 1; i <= k; i++) {
                int tmpMaxProfit = -prices[0];
                for (int j = 1; j < prices.length; j++) {
                    maxProfit[i][j] = Math.max(maxProfit[i][j - 1], prices[j] + tmpMaxProfit);
                    tmpMaxProfit = Math.max(tmpMaxProfit, maxProfit[i - 1][j - 1] - prices[j]);
                }
            }

            return maxProfit[k][prices.length - 1];
        }
    }
}
