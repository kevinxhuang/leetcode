package com.leetcode;

/**
 * https://leetcode.com/problems/reverse-string/
 */
public class ReverseString {

	public String reverseString(String s) {
		StringBuilder sb = new StringBuilder(s);
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		System.out.println(new ReverseString().reverseString("hello"));
	}
}
