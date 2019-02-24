package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LargestNumberTest {
    @Test
    public void testLargestNumber() {
        assertEquals(new LargestNumber().largestNumber(new int[]{3, 30, 34, 5, 9}), "9534330");
        assertEquals(new LargestNumber().largestNumber(new int[]{1}), "1");
        assertEquals(new LargestNumber().largestNumber(new int[]{1, 2, 3, 4}), "4321");
        assertEquals(new LargestNumber().largestNumber(new int[]{121,12}), "12121");
        assertEquals(new LargestNumber().largestNumber(new int[]{12,121}), "12121");
        assertEquals(new LargestNumber().largestNumber(new int[]{0,0}), "0");
        assertEquals(new LargestNumber().largestNumber(new int[]{999999998,999999997,999999999}), "999999999999999998999999997");
    }
}
