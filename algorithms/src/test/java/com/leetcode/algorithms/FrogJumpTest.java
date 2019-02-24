package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrogJumpTest {
    @Test
    public void testCanCross() {
        assertEquals(new FrogJump().canCross(new int[]{0,1,3,5,6,8,12,17}), true);
        assertEquals(new FrogJump().canCross(new int[]{0,1,2,3,4,8,9,11}), false);
        assertEquals(new FrogJump().canCross(new int[]{0,1}), true);
        assertEquals(new FrogJump().canCross(new int[]{0,2}), false);
    }
}
