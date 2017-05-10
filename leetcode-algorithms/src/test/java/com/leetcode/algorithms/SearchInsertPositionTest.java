package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SearchInsertPositionTest {
    @Test
    public void testSearchPosition() {
        assertEquals(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 5), 2);
        assertEquals(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 2), 1);
        assertEquals(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 7), 4);
        assertEquals(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 0), 0);
        assertEquals(new SearchInsertPosition().searchInsert(new int[]{}, 5), 0);
        assertEquals(new SearchInsertPosition().searchInsert(new int[]{3}, 5), 1);
        assertEquals(new SearchInsertPosition().searchInsert(new int[]{3}, 1), 0);
        assertEquals(new SearchInsertPosition().searchInsert(new int[]{1,3}, 2), 1);
    }
}
