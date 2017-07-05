package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RemoveDuplicatesFromSortedArrayTest {
    @Test
    public void testRemoveDuplicates() {
        assertEquals(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{}), 0);
        assertEquals(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,2}), 2);
        assertEquals(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,1}), 1);
        assertEquals(new RemoveDuplicatesFromSortedArray().removeDuplicates(new int[]{1,1,1,2}), 2);
    }
}
