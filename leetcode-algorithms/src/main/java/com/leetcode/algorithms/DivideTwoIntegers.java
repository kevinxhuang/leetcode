package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/divide-two-integers
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return Integer.MAX_VALUE;
        }
        int sign = (dividend < 0 ? -1 : 1) ^ (divisor < 0 ? -1 : 1);

        long dividendInternal = Math.abs((long)dividend);
        long divisorInternal = Math.abs((long)divisor);

        long result = _divide(dividendInternal, divisorInternal);
        if (result > Integer.MAX_VALUE && sign == 1) {
            return Integer.MAX_VALUE;
        }

        return sign == 0 ? (int)result : -(int)result;
    }

    private long _divide(long dividend, long divisor) {

        if (dividend < divisor) {
            return 0;
        }

        long sum = divisor;
        long count = 1;
        while (sum + sum < dividend) {
            sum += sum;
            count += count;
        }

        return count + _divide(dividend - sum, divisor);
    }
}
