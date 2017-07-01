package com.leetcode.algorithms;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CourseScheduleIIITest {
	@Test
	public void testScheduleCourse() {
		assertEquals(new CourseScheduleIII().scheduleCourse(new int[][]{{100,200},{200,1300},{1000,1250},{2000,3200}}), 3);
		assertEquals(new CourseScheduleIII().scheduleCourse(new int[][]{{1,2},{2,3}}), 2);
		assertEquals(new CourseScheduleIII().scheduleCourse(new int[][]{{7,16},{2,3},{3,12},{3,14},{10,19},{10,16},{6,8},{6,11},{3,13},{6,16}}), 4);
		assertEquals(new CourseScheduleIII().scheduleCourse(new int[][]{}), 0);
	}
}
