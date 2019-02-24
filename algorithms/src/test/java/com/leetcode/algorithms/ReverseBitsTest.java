package com.leetcode.algorithms;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class ReverseBitsTest {
    @Test
    public void testReverseBits() {
        assertEquals(new ReverseBits().reverseBits(43261596), 964176192);
    }
}
