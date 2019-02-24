package com.leetcode.algorithms;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class StringToIntegerTest {
    @Test
    public void testMyAtoi() {
        assertEquals(new StringToInteger().myAtoi("123456"), 123456);
        assertEquals(new StringToInteger().myAtoi("+"), 0);
        assertEquals(new StringToInteger().myAtoi("-"), 0);
        assertEquals(new StringToInteger().myAtoi("01"), 1);
        assertEquals(new StringToInteger().myAtoi("    010"), 10);
        assertEquals(new StringToInteger().myAtoi(""), 0);
        assertEquals(new StringToInteger().myAtoi("  -0012a42"), -12);
        assertEquals(new StringToInteger().myAtoi("2147483648"), 2147483647);
    }
}
