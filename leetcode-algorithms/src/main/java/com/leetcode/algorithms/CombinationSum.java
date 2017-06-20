package com.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/combination-sum
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        if (candidates.length > 0) {
            Arrays.sort(candidates);
            combinationSum(0, candidates, target, new ArrayList<>(), result);
        }

        return result;
    }

    private void combinationSum(int start, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
        if (target > 0) {
            for(int i = start; i < candidates.length && candidates[i] <= target; i++) {
                current.add(candidates[i]);
                combinationSum(i, candidates, target - candidates[i], current, result);
                current.remove(current.size() - 1); // Remove last one.
            }
        } else if (target == 0) {
            result.add(new ArrayList<>(current));
        }
    }
}
