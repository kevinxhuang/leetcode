package com.leetcode.algorithms;

import com.leetcode.algorithms.model.Interval;

import java.util.Arrays;
import java.util.Comparator;

/**
  */
public class NonOverlappingIntervals {
    public int eraseOverlapIntervals(Interval[] intervals) {
        Arrays.sort(intervals, new IntervalComparator());
        boolean[] removedIntervals = new boolean[intervals.length];

        for(int i = 1; i < intervals.length; i++) {
            for(int j = i - 1; j >= 0; j--) { // overlapping
                if (!removedIntervals[j] && intervals[i].start >= intervals[j].start && intervals[i].start < intervals[j].end) {
                    int toBeRemovedIndex = intervals[i].end >= intervals[j].end ? i : j;
                    removedIntervals[toBeRemovedIndex] = true;
                    break;
                }
            }
        }

        int count = 0;
        for(boolean removedInterval : removedIntervals) {
            if(removedInterval) {
                count++;
            }
        }

        return count;
    }

    public class IntervalComparator implements Comparator<Interval> {

        @Override
        public int compare(Interval interval1, Interval interval2) {
            if (interval1.start != interval2.start) {
                return interval1.start - interval2.start;
            } else {
                return (interval1.end - interval1.start) - (interval2.start - interval2.end);
            }
        }
    }
}
