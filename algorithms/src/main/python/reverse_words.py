'''
https://oj.leetcode.com/problems/reverse-words-in-a-string/
'''

class Solution:
    # @param s, a string
    # @return a string
    def reverseWords(self, s):
        words = str(s).split()
        reversed_str = ' '.join(words[::-1])
        return reversed_str