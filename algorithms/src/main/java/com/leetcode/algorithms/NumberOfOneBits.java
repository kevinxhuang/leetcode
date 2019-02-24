package com.leetcode.algorithms;

/**
  */
public class NumberOfOneBits {
    public int hammingWeight(int n) {
        int m = n;
        int count = 0;
        while(m != 0) {
            m = m & (m-1);
            count++;
        }

        return count;
    }
}
