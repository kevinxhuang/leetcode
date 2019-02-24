package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class UniquePathsTest {
    @Test
    public void testUniquePaths() {
        assertEquals(new UniquePaths().uniquePaths(1, 1), 1);
        assertEquals(new UniquePaths().uniquePaths(2, 2), 2);
        assertEquals(new UniquePaths().uniquePaths(2, 3), 3);
        assertEquals(new UniquePaths().uniquePaths(3, 2), 3);
        assertEquals(new UniquePaths().uniquePaths(3, 3), 6);
    }
}
