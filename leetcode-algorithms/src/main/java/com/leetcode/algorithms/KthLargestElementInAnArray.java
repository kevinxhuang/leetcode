package com.leetcode.algorithms;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
  */
public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> topKNums = IntStream.of(nums).boxed().sorted(Comparator.reverseOrder()).limit(k).collect(Collectors.toList());
        return topKNums.get(topKNums.size() - 1);
    }
}
