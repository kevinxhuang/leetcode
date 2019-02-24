package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ThirdMaximumNumberTest {
    @Test
    public void testThirdMax() {
        assertEquals(new ThirdMaximumNumber().thirdMax(new int[]{3, 2, 1}), 1);
        assertEquals(new ThirdMaximumNumber().thirdMax(new int[]{1, 2}), 2);
        assertEquals(new ThirdMaximumNumber().thirdMax(new int[]{2, 2, 3, 1}), 1);
    }
}
