package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {

    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }
}
