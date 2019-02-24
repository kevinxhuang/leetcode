package com.leetcode.algorithms;


import com.leetcode.algorithms.model.Interval;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NonOverlappingIntervalsTest {
    @Test
    public void testEraseOverlapIntervals() {
        assertEquals(new NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2),
                new Interval(2, 3), new Interval(3, 4),
                new Interval(1, 3)}), 1);
        assertEquals(new NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2),
                new Interval(1, 2), new Interval(1, 2)}), 2);
        assertEquals(new NonOverlappingIntervals().eraseOverlapIntervals(new Interval[]{new Interval(1, 2),
                new Interval(2, 3)}), 0);
    }
}
