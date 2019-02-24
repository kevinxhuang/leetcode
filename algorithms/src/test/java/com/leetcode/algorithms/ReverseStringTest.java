package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ReverseStringTest {
    @Test
    public void testReverseString() {
        assertEquals(new ReverseString().reverseString("hello"), "olleh");
    }
}
