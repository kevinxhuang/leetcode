package com.leetcode.algorithms;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/course-schedule-ii/?tab=Description
 */
public class CourseScheduleII {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] graph = new int[numCourses][numCourses];
        int[] inDegree = new int[numCourses];

        for(int i = 0; i < prerequisites.length; i++) {
            int courseA = prerequisites[i][0];
            int courseB = prerequisites[i][1];
            graph[courseB][courseA] = 1;
            inDegree[courseA]++;
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        int[] courseSchedule = new int[numCourses];
        int courseScheduleCursor = 0;
        while(!queue.isEmpty()) {
            int node = queue.poll();
            courseSchedule[courseScheduleCursor++] = node;
            for(int i = 0; i < numCourses; i++) {
                if (graph[node][i] == 1) {
                    inDegree[i]--;
                    if (inDegree[i] == 0) {
                        queue.add(i);
                    }
                }
            }
        }

        if (courseScheduleCursor != numCourses) {
            return new int[0];
        }

        return courseSchedule;
    }
}
