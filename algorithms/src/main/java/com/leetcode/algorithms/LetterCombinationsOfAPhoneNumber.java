package com.leetcode.algorithms;

import java.util.*;

/**
  */
public class LetterCombinationsOfAPhoneNumber {
    private static Map<Character, String> phoneNumberMap = null;
    static {
        phoneNumberMap = new HashMap<>();
        phoneNumberMap.put('0', " ");
        phoneNumberMap.put('1', "");
        phoneNumberMap.put('2', "abc");
        phoneNumberMap.put('3', "def");
        phoneNumberMap.put('4', "ghi");
        phoneNumberMap.put('5', "jkl");
        phoneNumberMap.put('6', "mno");
        phoneNumberMap.put('7', "pqrs");
        phoneNumberMap.put('8', "tuv");
        phoneNumberMap.put('9', "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        if (digits.contains("1")) {
            return Collections.EMPTY_LIST;
        }
        Set<String> resultSet = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        _letterCombinations(sb, 0, digits, resultSet);

        String[] result = new String[resultSet.size()];
        resultSet.toArray(result);
        return Arrays.asList(result);
    }

    private void _letterCombinations(final StringBuilder prefix, final int pos, final String digists, final Set<String> resultSet) {
        if (pos == digists.length()) {
            if (prefix.length() > 0) {
                resultSet.add(prefix.toString());
            }
        } else {
            for (char c : phoneNumberMap.get(digists.charAt(pos)).toCharArray()) {
                _letterCombinations(prefix.append(c), pos + 1, digists, resultSet);
                prefix.deleteCharAt(prefix.length() - 1);
            }
        }
    }
}
