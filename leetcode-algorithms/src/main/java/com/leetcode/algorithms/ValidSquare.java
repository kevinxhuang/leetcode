package com.leetcode.algorithms;

import java.util.HashSet;
import java.util.Set;

/**
  */
public class ValidSquare {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        Set<Integer> distSet = new HashSet<>();
        distSet.add(distance(p1, p2));
        distSet.add(distance(p1, p3));
        distSet.add(distance(p1, p4));
        distSet.add(distance(p2, p3));
        distSet.add(distance(p2, p4));
        distSet.add(distance(p3, p4));

        return !distSet.contains(0) && distSet.size() == 2;
    }

    public int distance(int[] p1, int[] p2) {
        return Math.abs((p1[0] - p2[0]) * (p1[0] - p2[0]) + (p1[1] - p2[1]) * (p1[1] - p2[1]));
    }
}
