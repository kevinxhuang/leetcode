'''
https://oj.leetcode.com/problems/largest-number/
'''

class Solution:
    # @param num, a list of integers
    # @return a string
    def largestNumber(self, num):
        num.sort((lambda a, b: cmp(str(a), str(b)) if not (str(a).startswith(str(b)) or str(b).startswith(str(a))) else cmp(str(a) + str(b), str(b) + str(a))), reverse=True)
        return str(int(reduce((lambda x, y: str(x) + str(y)), num)))