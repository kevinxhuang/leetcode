package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TotalHammingDistanceTest {
    @Test
    public void testTotalHammingDistance() {
        assertEquals(new TotalHammingDistance().totalHammingDistance(new int[]{4, 14, 2}), 6);
        assertEquals(new TotalHammingDistance().totalHammingDistance(new int[]{0, 1}), 1);
        assertEquals(new TotalHammingDistance().totalHammingDistance(new int[]{}), 0);
        assertEquals(new TotalHammingDistance().totalHammingDistance(new int[]{0}), 0);
    }
}
