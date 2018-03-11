package com.leetcode.algorithms;

/**
  */
public class TotalHammingDistance {
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int oneCount = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & 1) != 0)
                    oneCount++;
                nums[j] >>= 1;
            }
            result += oneCount * (nums.length - oneCount);
        }
        return result;
    }
}
