package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HouseRobberTest {
    @Test
    public void testRob() {
        assertEquals(new HouseRobber().rob(new int[]{1}), 1);
        assertEquals(new HouseRobber().rob(new int[]{1,2}), 2);
        assertEquals(new HouseRobber().rob(new int[]{1,2,3}), 4);
        assertEquals(new HouseRobber().rob(new int[]{1,3,2}), 3);
    }
}
