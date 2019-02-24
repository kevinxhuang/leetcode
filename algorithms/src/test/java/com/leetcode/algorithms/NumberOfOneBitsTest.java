package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NumberOfOneBitsTest {
    @Test
    public void testHammingWeight() {
        assertEquals(3, new NumberOfOneBits().hammingWeight(11));
    }
}
