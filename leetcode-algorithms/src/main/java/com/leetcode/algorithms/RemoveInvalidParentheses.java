package com.leetcode.algorithms;

import java.util.*;

/**
 * https://leetcode.com/problems/remove-invalid-parentheses/
 */
public class RemoveInvalidParentheses {
    public List<String> removeInvalidParentheses(String s) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        List<String> result = new LinkedList<>();

        queue.add(s);
        visited.add(s);

        boolean found = false;

        while(!queue.isEmpty()) {
            String str = queue.poll();

            if(isVaild(str)) {
                found = true;
                result.add(str);
            }

            if (found) { // Continue to find the same length valid string.
                continue;
            }

            for(int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '(' && str.charAt(i) != ')') { // Ignore invalid char
                    continue;
                }

                String tmp = str.substring(0, i) + str.substring(i+1);
                if (!visited.contains(tmp)) {
                    queue.add(tmp);
                    visited.add(tmp);
                }
            }
        }

        return result;
    }

    public boolean isVaild(String str) {
        int count = 0;

        for(char c : str.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
                if (count < 0) {
                    return false;
                }
            }
        }

        return count == 0;
    }
}
