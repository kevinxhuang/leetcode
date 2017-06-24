package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchInRotatedSortedArrayTest {
    @Test
    public void testSearch() {
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{}, 3), -1);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3), -1);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{4, 5, 6, 7, 0, 1, 2}, 7), 3);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{1}, 1), 0);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{1}, 0), -1);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{1, 2}, 0), -1);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{1, 2, 3}, 2), 1);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{1}, 2), -1);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{3, 1}, 1), 1);
        assertEquals(new SearchInRotatedSortedArray().search(new int[]{7, 8, 9, 0, 6}, 1), -1);
    }
}
