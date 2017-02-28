package com.leetcode;

/**
 * https://leetcode.com/problems/unique-binary-search-trees/?tab=Description
 *
 * Inspired by https://discuss.leetcode.com/topic/5673/dp-problem-10-lines-with-comments
 *  1 as root: # of trees = F(0) * F(n-1)  // F(0) == 1
 *  2 as root: # of trees = F(1) * F(n-2)
 *  3 as root: # of trees = F(2) * F(n-3)
 *  ...
 *  n-1 as root: # of trees = F(n-2) * F(1)
 *  n as root:   # of trees = F(n-1) * F(0)
 *
 *  So, the formulation is:
 *      F(n) = F(0) * F(n-1) + F(1) * F(n-2) + F(2) * F(n-3) + ... + F(n-2) * F(1) + F(n-1) * F(0)
 */
public class UniqueBinarySearchTrees {
	public int numTrees(int n) {
		int[] dp = new int[n+1];
		dp[0] = 1;
		dp[1] = 1;
		for(int i = 2; i <= n; i++) {
			dp[i] = 0;
			for(int j = 1; j <= i; j++) {
				dp[i] += dp[j-1] * dp[i-j];
			}
		}

		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(new UniqueBinarySearchTrees().numTrees(3));
	}

}
