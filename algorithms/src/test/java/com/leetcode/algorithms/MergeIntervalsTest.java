package com.leetcode.algorithms;

import com.leetcode.algorithms.model.Interval;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class MergeIntervalsTest {
    @Test
    public void testMerge() {
        List<Interval> intervals = new ArrayList<>();
        //1,3],[2,6],[8,10],[15,18]
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));

        List<Interval> mergedIntervals = new MergeIntervals().merge(intervals);
        assertEquals(mergedIntervals.size(), 3);
    }
}
