package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NonOverlappingIntervalsTest {
    @Test
    public void testEraseOverlapIntervals() {
        assertEquals(new NonOverlappingIntervals().eraseOverlapIntervals(new NonOverlappingIntervals.Interval[]{new NonOverlappingIntervals.Interval(1, 2),
                new NonOverlappingIntervals.Interval(2, 3), new NonOverlappingIntervals.Interval(3, 4),
                new NonOverlappingIntervals.Interval(1, 3)}), 1);
        assertEquals(new NonOverlappingIntervals().eraseOverlapIntervals(new NonOverlappingIntervals.Interval[]{new NonOverlappingIntervals.Interval(1, 2),
                new NonOverlappingIntervals.Interval(1, 2), new NonOverlappingIntervals.Interval(1, 2)}), 2);
        assertEquals(new NonOverlappingIntervals().eraseOverlapIntervals(new NonOverlappingIntervals.Interval[]{new NonOverlappingIntervals.Interval(1, 2),
                new NonOverlappingIntervals.Interval(2, 3)}), 0);
    }
}
