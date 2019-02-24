package com.leetcode.algorithms;


import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class RemoveInvalidParenthesesTest {
    @Test
    public void testRemoveInvalidParentheses() {
        assertEquals(new RemoveInvalidParentheses().removeInvalidParentheses("()())()"), Arrays.asList("(())()", "()()()"));
        assertEquals(new RemoveInvalidParentheses().removeInvalidParentheses("(a)())()"), Arrays.asList("(a())()", "(a)()()"));
        assertEquals(new RemoveInvalidParentheses().removeInvalidParentheses(")("), Arrays.asList(""));
    }

}
