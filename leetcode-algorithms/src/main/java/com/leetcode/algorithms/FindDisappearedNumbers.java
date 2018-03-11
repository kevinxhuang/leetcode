package com.leetcode.algorithms;

import java.util.ArrayList;
import java.util.List;

/**
  */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            while(nums[i] - 1 != i) {
                if (nums[i] != nums[nums[i] - 1]) {
                    int temp = nums[nums[i] - 1];
                    nums[nums[i] - 1] = nums[i];
                    nums[i] = temp;
                } else {
                    break;
                }
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if((nums[i] - 1) != i) {
                result.add(i + 1);
            }
        }
        return result;
    }
}
