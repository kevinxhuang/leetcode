package com.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * https://leetcode.com/problems/circular-array-loop/
 */
public class CircularArrayLoop {
    public boolean circularArrayLoop(int[] nums) {
        if (nums.length < 2) {
            return false;
        }

        for(int num : nums) {
            if (num == 0) {
                return false;
            }
        }

        HashSet<Integer> accessed = new HashSet(nums.length);
        List<Integer> indexList = new ArrayList<>(nums.length);
        int index = 0;
        while (accessed.size() < nums.length) {
            if(accessed.contains(index)) {
                break;
            } else {
                accessed.add(index);
                indexList.add(index);
                index = ((index + nums[index]) + nums.length) % nums.length;
            }
        }

        if (indexList.size() == nums.length || index != 0) {
            return false;
        }

        List<Integer> loopList = indexList.subList(indexList.indexOf(index), indexList.size());
        boolean isForward = nums[loopList.get(0)] > 0;
        for(int i : loopList) {
            if((isForward && nums[i] < 0) || (!isForward && nums[i] > 0)){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new CircularArrayLoop().circularArrayLoop(new int[]{2, -1, 1, 2, 2})); //true
        System.out.println(new CircularArrayLoop().circularArrayLoop(new int[]{-1, 2})); //false
        System.out.println(new CircularArrayLoop().circularArrayLoop(new int[]{2, 0, 2, 1, 3})); //false
        System.out.println(new CircularArrayLoop().circularArrayLoop(new int[]{2, -1, 1, -2, -2})); //false
        System.out.println(new CircularArrayLoop().circularArrayLoop(new int[]{1, 2, 3, 4, 5})); //true
        System.out.println(new CircularArrayLoop().circularArrayLoop(new int[]{3,1,2})); // true
        System.out.println(new CircularArrayLoop().circularArrayLoop(new int[]{-1, -2, -3, -4, -5})); //false
    }

}
