package com.leetcode.algorithms;

/**
 * https://leetcode.com/problems/longest-palindrome/
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] charCount = new int['z' - 'A' + 1];
        for(char c : s.toCharArray()) {
            charCount[c - 'A']++;
        }

        int length = 0;
        for(int i = 0; i < charCount.length; i++) {
            if (charCount[i] == 0) {
                continue;
            }

            if (charCount[i] % 2 == 0) {
                length += charCount[i];
                charCount[i] = 0;
            } else if (charCount[i] > 1){
                length += charCount[i] - 1;
                charCount[i] = 1;
            }
        }

        for(int i = 0; i < charCount.length; i++) {
            if (charCount[i] > 0) {
                length++;
                break;
            }
        }

        return length;
    }
}
