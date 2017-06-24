package com.leetcode.algorithms;


import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1;
        }

        int rotatedIndex = getRotatedIndex(nums);
        int index = -1;
        if (rotatedIndex == -1) { // sorted
            index = Arrays.binarySearch(nums, target);
        } else {
            if (target >= nums[0] && target <= nums[rotatedIndex - 1]) {
                index = Arrays.binarySearch(Arrays.copyOfRange(nums, 0, rotatedIndex), target);
            } else if (target >= nums[rotatedIndex] && target <= nums[nums.length - 1]) {
                index = Arrays.binarySearch(Arrays.copyOfRange(nums, rotatedIndex, nums.length), target);
                if (index >= 0) {
                    index += rotatedIndex;
                }
            }
        }

        return index >= 0 ? index : -1;
    }

    private int getRotatedIndex(int[] nums) {
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] > nums[i+1]) {
                return i + 1;
            }
        }

        return -1;
    }
}
