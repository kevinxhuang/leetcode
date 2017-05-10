package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/integer-break/
 */
public class IntegerBreak {
    public int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        } else {
            return _integerBreak(n);
        }
    }

    private int _integerBreak(int n) {
        if (n <= 4) {
            return n;
        } else {
            return Math.max(2 * _integerBreak(n - 2), 3 * _integerBreak(n - 3));
        }
    }
}
