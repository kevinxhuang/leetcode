package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class ValidSquareTest {
    @Test
    public void testValidSquare() {
        assertTrue(new ValidSquare().validSquare(new int[]{0,0}, new int[]{1,1}, new int[]{1,0}, new int[]{0,1}));
        assertTrue(new ValidSquare().validSquare(new int[]{1,0}, new int[]{-1,0}, new int[]{0,1}, new int[]{0,-1}));
        assertFalse(new ValidSquare().validSquare(new int[]{0,0}, new int[]{1,1}, new int[]{1,0}, new int[]{1,1}));
    }
}
