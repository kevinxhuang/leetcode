package com.leetcode;

import java.util.*;

/**
 * https://leetcode.com/problems/letter-combinations-of-a-phone-number/
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

	public static void main(String[] args) {
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations(""));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("1"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("2"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("3"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("4"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("5"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("6"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("7"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("8"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("9"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("0"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("23"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("312"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("1234567890"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("11111"));
		System.out.println(new LetterCombinationsOfAPhoneNumber().letterCombinations("211112"));
	}
}
