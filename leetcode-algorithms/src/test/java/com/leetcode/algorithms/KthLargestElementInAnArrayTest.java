package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KthLargestElementInAnArrayTest {
    @Test
    public void testFindKthLargest() {
        assertEquals(new KthLargestElementInAnArray().findKthLargest(new int[]{3,2,1,5,6,4}, 2), 5);
    }
}
