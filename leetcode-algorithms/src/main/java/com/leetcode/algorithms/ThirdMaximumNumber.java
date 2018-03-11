package com.leetcode.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
  */
public class ThirdMaximumNumber {
    public int thirdMax(int[] nums) {
        List<Integer> topThreeNums = Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).distinct().limit(3).collect(Collectors.toList());
        return topThreeNums.size() == 3 ? topThreeNums.get(topThreeNums.size() - 1) : topThreeNums.get(0);
    }
}
