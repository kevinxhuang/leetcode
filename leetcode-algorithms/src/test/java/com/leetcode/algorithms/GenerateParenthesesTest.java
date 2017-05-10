package com.leetcode.algorithms;


import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.testng.Assert.assertEquals;

public class GenerateParenthesesTest {
    @Test
    public void testGenerateParenthesis() {
        assertEquals(new GenerateParentheses().generateParenthesis(0), Collections.EMPTY_LIST);
        assertEquals(new GenerateParentheses().generateParenthesis(1), Arrays.asList("()"));
        assertEquals(new GenerateParentheses().generateParenthesis(2), Arrays.asList("(())", "()()"));
        assertEquals(new GenerateParentheses().generateParenthesis(3), Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"));
    }
}
