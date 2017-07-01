package com.leetcode.algorithms;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DivideTwoIntegersTest {
    @Test
    public void testDivide() {
        assertEquals(new DivideTwoIntegers().divide(1, 0), Integer.MAX_VALUE);
        assertEquals(new DivideTwoIntegers().divide(4, 2), 2);
        assertEquals(new DivideTwoIntegers().divide(5, 2), 2);
        assertEquals(new DivideTwoIntegers().divide(-1, 1), -1);
        assertEquals(new DivideTwoIntegers().divide(-2147483648, 1), -2147483648);
        assertEquals(new DivideTwoIntegers().divide(10, 3), 3);
    }
}
