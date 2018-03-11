package com.leetcode.algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
  */
public class SpiralMatrix {

    private int[] MOVE_X = new int[]{0, 1, 0, -1};
    private int[] MOVE_Y = new int[]{1, 0, -1, 0};
    private int NUM_DIRECTION = 4;

    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0) {
            return Collections.EMPTY_LIST;
        }

        List<Integer> result = new ArrayList<>();

        int m = matrix[0].length;
        int n = matrix.length;
        int total = m * n;

        int x = 0;
        int y = -1;

        while (result.size() != total) {
            for(int d = 0; d < NUM_DIRECTION; d++) {
                if (d % 2 == 0) { // left, right
                    for(int i = 0; i < m; i++) {
                        x += MOVE_X[d];
                        y += MOVE_Y[d];
                        result.add(matrix[x][y]);
                    }
                    m--;
                } else { // up, down
                    for(int i = 0; i < n - 1; i++) {
                        x += MOVE_X[d];
                        y += MOVE_Y[d];
                        result.add(matrix[x][y]);
                    }
                    n--;
                }

                if (result.size() == total) {
                    return result;
                }
            }
        }

        return result;
    }
}
