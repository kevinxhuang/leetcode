package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CircularArrayLoopTest {
    @Test
    public void testCircularArrayLoop() {
        assertEquals(new CircularArrayLoop().circularArrayLoop(new int[]{2, -1, 1, 2, 2}), true);
        assertEquals(new CircularArrayLoop().circularArrayLoop(new int[]{-1, 2}), false);
        assertEquals(new CircularArrayLoop().circularArrayLoop(new int[]{2, 0, 2, 1, 3}), false);
        assertEquals(new CircularArrayLoop().circularArrayLoop(new int[]{2, -1, 1, -2, -2}), false);
        assertEquals(new CircularArrayLoop().circularArrayLoop(new int[]{1, 2, 3, 4, 5}), true);
        assertEquals(new CircularArrayLoop().circularArrayLoop(new int[]{3,1,2}), true);
        assertEquals(new CircularArrayLoop().circularArrayLoop(new int[]{-1, -2, -3, -4, -5}), false);
    }
    
}
