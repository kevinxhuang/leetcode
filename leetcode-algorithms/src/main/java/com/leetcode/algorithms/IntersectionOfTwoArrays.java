package com.leetcode.algorithms;

import java.util.*;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int cursor1 = 0;
        int cursor2 = 0;
        Set<Integer> result = new HashSet<>();
        while(nums1.length> 0 && nums2.length >0 && cursor1 < nums1.length && cursor2 < nums2.length) {
            if (nums1[cursor1] > nums2[cursor2]) {
                cursor2++;
            } else if (nums1[cursor1] < nums2[cursor2]) {
                cursor1++;
            } else {
                result.add(nums1[cursor1]);
                cursor1++;
                cursor2++;
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
