package com.leetcode.algorithms;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/longest-substring-without-repeating-characters
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }

        int[] dp = new int[s.length()];
        dp[0] = 1;

        for(int i = 1; i < s.length(); i++) {
            if (!s.substring(i - dp[i-1], i).contains(s.substring(i, i + 1))) {
                dp[i] = dp[i-1] + 1;
            } else {
                for(int j = i - 1; j >= 0; j--) {
                    if (s.charAt(j) == s.charAt(i)) {
                        dp[i] = i - j;
                        break;
                    }
                }
            }
        }

        return Arrays.stream(dp).max().getAsInt();
    }
}
