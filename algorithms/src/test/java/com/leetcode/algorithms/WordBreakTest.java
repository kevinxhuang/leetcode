package com.leetcode.algorithms;


import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class WordBreakTest {
    @Test
    public void testWordBreak() {
        assertEquals(new WordBreak().wordBreak("leetcode", Arrays.asList(new String[]{"leet", "code"})), true);
        assertEquals(new WordBreak().wordBreak("", Arrays.asList(new String[]{"leet", "code"})), true);
        assertEquals(new WordBreak().wordBreak("code", Arrays.asList(new String[]{"leet", "code"})), true);
        assertEquals(new WordBreak().wordBreak("leetcode", Arrays.asList(new String[]{"a", "b"})), false);
    }
}
