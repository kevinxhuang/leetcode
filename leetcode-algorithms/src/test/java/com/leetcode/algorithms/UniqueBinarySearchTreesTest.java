package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UniqueBinarySearchTreesTest {
    @Test
    public void testNumTrees() {
        assertEquals(new UniqueBinarySearchTrees().numTrees(3), 5);
    }
    
}
