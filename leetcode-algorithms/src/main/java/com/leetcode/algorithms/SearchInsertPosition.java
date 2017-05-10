package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        int start = 0;
        int end = nums.length - 1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1 ;
            } else if (nums[mid] > target){
                end = mid - 1;
            } else {
                return mid;
            }
        }

        int result = nums[mid] > target ? mid : mid + 1;
        return result > 0 ? result : 0;
    }
}
