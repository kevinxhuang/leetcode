package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PredictTheWinnerTest {
    @Test
    public void testPredictTheWinner() {
        assertFalse(new PredictTheWinner().PredictTheWinner(new int[]{1, 5, 2}));
        assertTrue(new PredictTheWinner().PredictTheWinner(new int[]{1, 5, 233, 7}));
        assertTrue(new PredictTheWinner().PredictTheWinner(new int[]{1}));
    }
}
