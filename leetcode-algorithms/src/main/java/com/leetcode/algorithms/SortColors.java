package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/sort-colors
 */
public class SortColors {
    public void sortColors(int[] nums) {
        if (nums.length <= 1) {
            return;
        }

        int redIndex = 0;
        while(redIndex < nums.length && nums[redIndex] == 0) {
            redIndex++;
        }
        int blueIndex = nums.length - 1;
        while(blueIndex >= 0 && nums[blueIndex] == 2) {
            blueIndex--;
        }

        int whiteIndex1 = nums.length / 2;
        int whiteIndex2 = nums.length / 2;

        while(whiteIndex1 >= redIndex && whiteIndex1 <= blueIndex) {
            if (nums[whiteIndex1] == 0 && redIndex < nums.length) {
                swap(whiteIndex1, redIndex, nums);
                redIndex++;
                continue;
            }

            if (nums[whiteIndex1] == 2 && blueIndex >= 0) {
                swap(whiteIndex1, blueIndex, nums);
                blueIndex--;
                continue;
            }

            whiteIndex1--;
        }

        while(whiteIndex2 >= redIndex && whiteIndex2 <= blueIndex) {
            if (nums[whiteIndex2] == 0 && redIndex < nums.length) {
                swap(whiteIndex2, redIndex, nums);
                redIndex++;
                continue;
            }

            if (nums[whiteIndex2] == 2 && blueIndex >= 0) {
                swap(whiteIndex2, blueIndex, nums);
                blueIndex--;
                continue;
            }

            whiteIndex2++;
        }
    }

    private void swap(int i, int j, int nums[]) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
