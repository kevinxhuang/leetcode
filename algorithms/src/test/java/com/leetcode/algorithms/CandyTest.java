package com.leetcode.algorithms;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CandyTest {
    @Test
    public void testCandy() {
        assertEquals(new Candy().candy(new int[]{2, 1, 3, 2, 1, 4, 3}), 12);
        assertEquals(new Candy().candy(new int[]{0}), 1);
        assertEquals(new Candy().candy(new int[]{1, 1, 1}), 3);
        assertEquals(new Candy().candy(new int[]{1, 2, 1}), 4);
        assertEquals(new Candy().candy(new int[]{2, 1, 2}), 5);
        assertEquals(new Candy().candy(new int[]{1, 2, 2}), 4);
        assertEquals(new Candy().candy(new int[]{2, 2, 1}), 4);
    }
    
}
