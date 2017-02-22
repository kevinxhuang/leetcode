package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/generate-parentheses/?tab=Description
 */
public class GenerateParentheses {
	public List<String> generateParenthesis(int n) {
		if (n == 0) {
			return Collections.EMPTY_LIST;
		}
		List<String> result = new ArrayList<>();
		_generateParenthesis("", n, n, result);

		return result;
	}

	private void _generateParenthesis(String current, int leftParenthesis, int rightParenthesis, List<String> result) {
		if (leftParenthesis == 0 && rightParenthesis == 0) {
			result.add(current);
			return;
		}

		if (leftParenthesis > 0) {
			_generateParenthesis(current + "(", leftParenthesis - 1, rightParenthesis, result);
		}

		if (rightParenthesis > 0 && leftParenthesis < rightParenthesis) {
			_generateParenthesis(current + ")", leftParenthesis, rightParenthesis - 1, result);
		}
	}

	public static void main(String[] args) {
		System.out.println(new GenerateParentheses().generateParenthesis(0));
		System.out.println(new GenerateParentheses().generateParenthesis(1));
		System.out.println(new GenerateParentheses().generateParenthesis(2));
		System.out.println(new GenerateParentheses().generateParenthesis(3));
	}
}
