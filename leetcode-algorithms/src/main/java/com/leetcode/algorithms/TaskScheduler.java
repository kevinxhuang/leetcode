package com.leetcode.algorithms;


import java.util.*;


public class TaskScheduler {
    public int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> taskMap = new HashMap<>();
        for (char task : tasks) {
            taskMap.put(task, taskMap.getOrDefault(task, 0) + 1);
        }
        PriorityQueue<Integer> taskQueue = new PriorityQueue<>((i1, i2) -> i2 - i1);
        taskQueue.addAll(taskMap.values());

        Map<Integer, Integer> coolDown = new HashMap<>();
        int totalTime = 0;
        while (!taskQueue.isEmpty() || !coolDown.isEmpty()) {
            if (coolDown.containsKey(totalTime - n - 1)) {
                taskQueue.offer(coolDown.remove(totalTime - n - 1));
            }

            if (!taskQueue.isEmpty()) {
                int left = taskQueue.poll() - 1;
                if (left != 0) coolDown.put(totalTime, left);
            }
            totalTime++;
        }

        return totalTime;
    }
}
