package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testLengthOfLongestSubstring() {
        assertEquals(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("abcabcbb"), 3);
        assertEquals(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("bbbbb"), 1);
        assertEquals(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("pwwkew"), 3);
        assertEquals(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring("au"), 2);
    }
}
