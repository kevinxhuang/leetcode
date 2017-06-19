package com.leetcode.algorithms;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class RomanToIntegerTest {
    @Test
    public void testRomanToInt() {
        assertEquals(1, new RomanToInteger().romanToInt("I"));
        assertEquals(1990, new RomanToInteger().romanToInt("MCMXC"));
        assertEquals(2014, new RomanToInteger().romanToInt("MMXIV"));
    }
}
