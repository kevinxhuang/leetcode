package com.leetcode.algorithms;

import java.util.*;

/**
 * https://leetcode.com/problems/frog-jump/
 */
public class FrogJump {
    public boolean canCross(int[] stones) {
        Map<Integer, Set<Integer>> stoneMap = new HashMap<>(); // stone -> jumps
        stoneMap.put(0, new HashSet<>());
        stoneMap.get(0).add(0);

        int maxJump = 0;
        int[] maxJumpList = new int[stones.length];
        for(int i = 1; i < stones.length; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j = i - 1; j >= 0; j--) {
                int jump = stones[i] - stones[j];
                if (jump > maxJumpList[j] + 1) {
                    break;
                } else {
                    if (stoneMap.get(j).contains(jump + 1) || stoneMap.get(j).contains(jump) || stoneMap.get(j).contains(jump - 1)) {
                        set.add(jump);
                        maxJump = Math.max(jump, maxJump);
                    }
                }
            }

            stoneMap.put(i, set);
            maxJumpList[i] = maxJump;
        }

        return stoneMap.get(stones.length - 1).size() > 0;
    }
}
