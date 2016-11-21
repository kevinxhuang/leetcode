package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/non-overlapping-intervals/
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

    public static class Interval {
        int start;
        int end;
        Interval() { start = 0; end = 0; }
        Interval(int s, int e) { start = s; end = e; }
    }

    public static void main(String[] args) {
        System.out.println(new NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2), new Interval(2, 3), new Interval(3, 4), new Interval(1, 3)}));
        System.out.println(new NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2), new Interval(1, 2), new Interval(1, 2)}));
        System.out.println(new NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2), new Interval(2, 3)}));
    }
}
