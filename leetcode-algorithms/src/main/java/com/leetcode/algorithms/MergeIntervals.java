package com.leetcode.algorithms;

import com.leetcode.algorithms.model.Interval;

import java.util.*;

/**
  */
public class MergeIntervals {
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new IntervalComparator());

        List<Interval> mergedIntervals = new ArrayList<>();
        Interval interval = null;
        for(int i = 0; i < intervals.size(); i++) {
            if (interval == null) {
                interval = new Interval(intervals.get(i).start, intervals.get(0).end);
            } else {
                if (intervals.get(i).start >= interval.start && intervals.get(i).start <= interval.end) {
                    interval = new Interval(interval.start, Math.max(interval.end, intervals.get(i).end));
                } else { // new interval
                    mergedIntervals.add(interval);
                    interval = new Interval(intervals.get(i).start, intervals.get(i).end);
                }
            }
        }

        if (interval != null) {
            mergedIntervals.add(interval);
        }
        return mergedIntervals;
    }

    public class IntervalComparator implements Comparator<Interval> {
        @Override
        public int compare(Interval interval1, Interval interval2) {
            return interval1.start - interval2.start;
        }
    }
}
