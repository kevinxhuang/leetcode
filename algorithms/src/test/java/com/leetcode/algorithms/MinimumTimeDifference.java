package com.leetcode.algorithms;

import java.util.List;
import java.util.stream.Collectors;

/**
  */
public class MinimumTimeDifference {
    private static final int ONE_DAY_MINS = 24 * 60;

    public int findMinDifference(List<String> timePoints) {
        List<Integer> minutes = timePoints.parallelStream().map(time -> {
            int hour = Integer.valueOf(time.split(":")[0]);
            int minute = Integer.valueOf(time.split(":")[1]);
            return hour * 60 + minute;
        }).sorted().collect(Collectors.toList());


        int minDiff = ONE_DAY_MINS;
        for(int i = 0; i < minutes.size() - 1; i++) {
            int diff = minutes.get(i + 1) - minutes.get(i);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        if (minutes.get(0) + ONE_DAY_MINS - minutes.get(minutes.size() - 1) < minDiff) {
            minDiff = minutes.get(0) + ONE_DAY_MINS - minutes.get(minutes.size() - 1);
        }

        return minDiff;
    }
}
