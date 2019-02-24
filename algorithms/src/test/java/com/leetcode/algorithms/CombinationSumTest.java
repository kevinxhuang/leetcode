package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class CombinationSumTest {
    @Test
    public void testCombinationSum() {
        assertEquals(2, new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7).size());
        assertEquals(0, new CombinationSum().combinationSum(new int[]{}, 7).size());
        assertEquals(1, new CombinationSum().combinationSum(new int[]{1}, 7).size());
        assertEquals(3, new CombinationSum().combinationSum(new int[]{1,2, 3}, 3).size());
    }

}
