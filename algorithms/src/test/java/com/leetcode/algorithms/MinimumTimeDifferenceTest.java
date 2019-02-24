package com.leetcode.algorithms;


import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class MinimumTimeDifferenceTest {
    @Test
    public void testFindMinDifference() {
        assertEquals(new MinimumTimeDifference().findMinDifference(Arrays.asList("23:59","00:00")), 1);
        assertEquals(new MinimumTimeDifference().findMinDifference(Arrays.asList("23:59","23:58")), 1);
        assertEquals(new MinimumTimeDifference().findMinDifference(Arrays.asList("23:56", "23:59","23:58")), 1);
    }
}
