package com.leetcode.algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/course-schedule-iii
 */
public class CourseScheduleIII {
	public int scheduleCourse(int[][] courses) {
		if (courses.length == 0) {
			return 0;
		}

		Arrays.sort(courses, Comparator.comparingInt(c -> c[1]));
		PriorityQueue<int[]> heap = new PriorityQueue<>(courses.length, (c1, c2) -> c2[0] - c1[0]);

		heap.offer(courses[0]);
		int days = courses[0][0];
		for(int i = 1; i < courses.length; i++) {
			int[] course = heap.poll(); // longest course.
			if (days + courses[i][0] <= courses[i][1]) {
				days = days + courses[i][0];
				heap.offer(course);
				heap.offer(courses[i]);
			} else if (days - course[0] + courses[i][0] <= courses[i][1] && courses[i][0] < course[0]) {
				days = days - course[0] + courses[i][0];
				heap.offer(courses[i]);
			} else {
				heap.offer(course);
			}
		}

		return heap.size();
	}
}
