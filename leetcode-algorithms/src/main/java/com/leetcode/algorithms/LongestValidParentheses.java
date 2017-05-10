package com.leetcode.algorithms;

import java.util.Stack;

/**
 * https://leetcode.com/problems/longest-valid-parentheses/
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                if (!stack.empty() && s.charAt(stack.peek()) == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }

        if (stack.empty()) {
            return s.length();
        } else if (stack.size() == 1) {
            return Math.max(stack.peek(), s.length() - stack.peek() - 1);
        } else {
            int previousTopItem = stack.peek();
            int length = s.length() - stack.pop() - 1;
            while(!stack.empty()) {
                length = Math.max(length, previousTopItem - stack.peek() - 1);
                previousTopItem = stack.pop();
            }
            length = Math.max(length, previousTopItem);
            return length;
        }
    }
}
