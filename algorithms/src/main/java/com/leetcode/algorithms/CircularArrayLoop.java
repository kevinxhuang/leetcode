package com.leetcode.algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
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
}
