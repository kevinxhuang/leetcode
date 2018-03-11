package com.leetcode.algorithms;

/**
  */
public class StringToInteger {
    public int myAtoi(String str) {
        String trimmedStr = str.trim();

        int sign = 1;
        int cursor = 0;
        if (trimmedStr.startsWith("+") || trimmedStr.startsWith("-")) {
            sign = trimmedStr.startsWith("+") ? 1 : -1;
            cursor++;
        }

        long result = 0;
        for(int i = cursor; i < trimmedStr.length(); i++) {
            if (trimmedStr.charAt(i) >= '0' && trimmedStr.charAt(i) <= '9'){
                result = result * 10 + Integer.valueOf(String.valueOf(trimmedStr.charAt(i)));
                if(result > Integer.MAX_VALUE){
                    return sign == -1 ? Integer.MIN_VALUE:Integer.MAX_VALUE;
                }
            } else {
                break;
            }
        }

        return (int)result * sign;
    }
}
