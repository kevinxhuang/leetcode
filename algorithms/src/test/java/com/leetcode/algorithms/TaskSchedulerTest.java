package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TaskSchedulerTest {
    @Test
    public void testLeastInterval() {
        assertEquals(new TaskScheduler().leastInterval(new char[]{'A','A','A','B','B','B'}, 2), 8);
        assertEquals(new TaskScheduler().leastInterval(new char[]{'A','A','A'}, 2), 7);
    }
}
