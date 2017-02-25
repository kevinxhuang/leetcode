package com.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/word-break/?tab=Description
 */
public class WordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
		boolean[] canBreak = new boolean[s.length() + 1];
		canBreak[0] = true;
		// canBreak[i] = (s[j,i) in wordDict) && canBreak[j]
		for(int i = 1; i <= s.length(); i++) {
			for(int j = i - 1; j >= 0; j--) {
				if (wordDict.contains(s.substring(j, i)) && canBreak[j]) {
					canBreak[i] = true;
				}
			}
		}

		return canBreak[s.length()];
	}

	public static void main(String[] args) {
		System.out.println(new WordBreak().wordBreak("leetcode", Arrays.asList(new String[]{"leet", "code"})));
		System.out.println(new WordBreak().wordBreak("", Arrays.asList(new String[]{"leet", "code"})));
		System.out.println(new WordBreak().wordBreak("code", Arrays.asList(new String[]{"leet", "code"})));
		System.out.println(new WordBreak().wordBreak("leetcode", Arrays.asList(new String[]{"a", "b"})));
	}
}
