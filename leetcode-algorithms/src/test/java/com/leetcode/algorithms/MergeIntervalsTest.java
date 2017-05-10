package com.leetcode.algorithms;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class MergeIntervalsTest {
    @Test
    public void testMerge() {
        List<MergeIntervals.Interval> intervals = new ArrayList<>();
        //1,3],[2,6],[8,10],[15,18]
        intervals.add(new MergeIntervals.Interval(1, 3));
        intervals.add(new MergeIntervals.Interval(2, 6));
        intervals.add(new MergeIntervals.Interval(8, 10));
        intervals.add(new MergeIntervals.Interval(15, 18));

        List<MergeIntervals.Interval> mergedIntervals = new MergeIntervals().merge(intervals);
        assertEquals(mergedIntervals.size(), 3);
    }
}
