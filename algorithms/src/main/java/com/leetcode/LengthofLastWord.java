package com.leetcode;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        if(words.length > 0) {
            return words[words.length - 1].length();
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new LengthofLastWord().lengthOfLastWord("Hello World"));
        System.out.println(new LengthofLastWord().lengthOfLastWord(""));
    }
}
