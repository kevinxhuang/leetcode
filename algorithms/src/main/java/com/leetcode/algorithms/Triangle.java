package com.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
  */
public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] minValues = new int[2][triangle.get(triangle.size() - 1).size()];
        minValues[0][0] = triangle.get(0).get(0);
        for(int i = 1; i < triangle.size(); i++) {
            for(int j = 0; j < triangle.get(i).size(); j++) {
                int min = Integer.MAX_VALUE;
                if (j - 1 >= 0 && j - 1 < triangle.get(i-1).size()) {
                    min = minValues[(i-1)%2][j-1];
                }
                if (j >= 0 && j  < triangle.get(i-1).size()) {
                    min = Math.min(min, minValues[(i-1)%2][j]);
                }
                minValues[i%2][j] = min + triangle.get(i).get(j);
            }
        }

        int min = Integer.MAX_VALUE;
        for(int value : minValues[(triangle.size() - 1)%2]) {
            min = Math.min(min, value);
        }
        return min;
    }
}
