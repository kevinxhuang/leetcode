package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class IntegerBreakTest {
    @Test
    public void testIntegerBreak() {
        assertEquals(new IntegerBreak().integerBreak(2), 1);
        assertEquals(new IntegerBreak().integerBreak(4), 4);
        assertEquals(new IntegerBreak().integerBreak(10), 36);
        assertEquals(new IntegerBreak().integerBreak(58), 1549681956);
    }
}
