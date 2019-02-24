package com.leetcode.algorithms;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class CourseScheduleIITest {
    @Test
    public void testFindOrder() {
        assertEquals(new CourseScheduleII().findOrder(0, new int[][]{}), new int[]{});
        assertEquals(new CourseScheduleII().findOrder(2, new int[][]{{1,0}}), new int[]{0, 1});
        assertEquals(new CourseScheduleII().findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}}), new int[]{0, 1, 2, 3});
        assertEquals(new CourseScheduleII().findOrder(2, new int[][]{{0,1}, {1,0}}), new int[]{});
    }
}
