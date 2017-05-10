package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class BuyAndSellStockIVTest {
    @Test
    public void testMaxProfit() {
        assertEquals(new BuyAndSellStockIV().maxProfit(2, new int[]{1, 2, 3, 4, 5}), 4);
        assertEquals(new BuyAndSellStockIV().maxProfit(2, new int[]{5, 2, 3, 4, 1}), 2);
        assertEquals(new BuyAndSellStockIV().maxProfit(1, new int[]{1, 2}), 1);
    }
}
