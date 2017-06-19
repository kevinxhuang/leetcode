package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static com.leetcode.algorithms.util.AssertUtil.compareArrays;

public class SortColorsTest {
    @Test
    public void testSortColors() {
        int[] testArray = new int[]{};
        new SortColors().sortColors(testArray);
        compareArrays(new int[]{}, testArray);

        testArray = new int[]{0, 0, 1, 1, 2, 2};
        new SortColors().sortColors(testArray);
        compareArrays(new int[]{0, 0, 1, 1, 2, 2}, testArray);

        testArray = new int[]{2, 2, 1, 1, 0, 0};
        new SortColors().sortColors(testArray);
        compareArrays(new int[]{0, 0, 1, 1, 2, 2}, testArray);

        testArray = new int[]{2, 1, 0, 2, 1, 0};
        new SortColors().sortColors(testArray);
        compareArrays(new int[]{0, 0, 1, 1, 2, 2}, testArray);

        testArray = new int[]{0, 0, 0};
        new SortColors().sortColors(testArray);
        compareArrays(new int[]{0, 0, 0}, testArray);

        testArray = new int[]{2, 1};
        new SortColors().sortColors(testArray);
        compareArrays(new int[]{1, 2}, testArray);

        testArray = new int[]{2, 0};
        new SortColors().sortColors(testArray);
        compareArrays(new int[]{0, 2}, testArray);
    }
}
