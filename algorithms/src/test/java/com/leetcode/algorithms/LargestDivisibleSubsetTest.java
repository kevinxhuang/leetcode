package com.leetcode.algorithms;


import com.leetcode.algorithms.util.AssertUtil;
import org.testng.annotations.Test;

import java.util.Arrays;

public class LargestDivisibleSubsetTest {
    @Test
    public void testLargestDivisibleSubset() {
        AssertUtil.compareElements(new LargestDivisibleSubset().largestDivisibleSubset(new int[]{1}), Arrays.asList(1));
        AssertUtil.compareElements(new LargestDivisibleSubset().largestDivisibleSubset(new int[]{}), Arrays.asList());
        AssertUtil.compareElements(new LargestDivisibleSubset().largestDivisibleSubset(new int[]{1, 2, 3}), Arrays.asList(1, 3));
        AssertUtil.compareElements(new LargestDivisibleSubset().largestDivisibleSubset(new int[]{1, 2, 4, 8}), Arrays.asList(1, 2, 4, 8));
        AssertUtil.compareElements(new LargestDivisibleSubset().largestDivisibleSubset(new int[]{1, 2, 3, 6, 8}), Arrays.asList(1, 2, 8));
    }
}
