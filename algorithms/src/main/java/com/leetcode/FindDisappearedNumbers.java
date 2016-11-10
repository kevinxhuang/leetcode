package com.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
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

    public static void main(String[] args) {
        System.out.println(new FindDisappearedNumbers().findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(new FindDisappearedNumbers().findDisappearedNumbers(new int[]{4,3,2,2}));
        System.out.println(new FindDisappearedNumbers().findDisappearedNumbers(new int[]{1,2}));
    }
}
