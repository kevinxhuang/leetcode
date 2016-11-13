package com.leetcode;

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

    public static void main(String[] args) {
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 5)); // 2
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 2)); // 1
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 7)); // 4
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3,5,6}, 0)); // 0
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{}, 5)); // 0
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{3}, 5)); // 1
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{3}, 1)); // 0
        System.out.println(new SearchInsertPosition().searchInsert(new int[]{1,3}, 2)); // 1
    }
}
