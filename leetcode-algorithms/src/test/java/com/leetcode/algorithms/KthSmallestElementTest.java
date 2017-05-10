package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KthSmallestElementTest {
    @Test
    public void testKthSmallest() {
        int[][] matrix = new int[][] {{1,  5,  9}, {10, 11, 13}, {12, 13, 15}};
        assertEquals(new KthSmallestElement().kthSmallest(matrix, 8), 13);
        assertEquals(new KthSmallestElement().kthSmallest(matrix, 1), 1);
        assertEquals(new KthSmallestElement().kthSmallest(matrix, 9), 15);
    }
}
