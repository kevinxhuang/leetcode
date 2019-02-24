package com.leetcode.algorithms;


import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LongestValidParenthesesTest {
    @Test
    public void testLongestValidParentheses() {
        assertEquals(new LongestValidParentheses().longestValidParentheses(")("), 0);
        assertEquals(new LongestValidParentheses().longestValidParentheses("(()"), 2);
        assertEquals(new LongestValidParentheses().longestValidParentheses(")()())"), 4);
        assertEquals(new LongestValidParentheses().longestValidParentheses("()(()"), 2);
        assertEquals(new LongestValidParentheses().longestValidParentheses("(()))())("), 4);
    }
}
