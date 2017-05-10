package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LongestPalindromeTest {
    @Test
    public void testLongestPalindrome() {
        assertEquals(new LongestPalindrome().longestPalindrome("abccccdd"), 7);
        assertEquals(new LongestPalindrome().longestPalindrome("abcdef"), 1);
        assertEquals(new LongestPalindrome().longestPalindrome("aaa"), 3);
        assertEquals(new LongestPalindrome().longestPalindrome(""), 0);
        assertEquals(new LongestPalindrome().longestPalindrome("zeusnilemacaronimaisanitratetartinasiaminoracamelinsuez"), 55);
    }
}
