package com.leetcode.algorithms;


import com.leetcode.algorithms.util.AssertUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

public class SpiralMatrixTest {
    @Test
    public void testSpiralOrder() {
        int[][] matrix1 = new int[][] {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        AssertUtil.compareElements(new SpiralMatrix().spiralOrder(matrix1), Arrays.asList(1,2,3,6,9,8,7,4,5));

        int[][] matrix2 = new int[][] {{1}};
        AssertUtil.compareElements(new SpiralMatrix().spiralOrder(matrix2), Arrays.asList(1));

        int[][] matrix3 = new int[][] {};
        AssertUtil.compareElements(new SpiralMatrix().spiralOrder(matrix3), Collections.EMPTY_LIST);
    }
}
