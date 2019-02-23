package com.leetcode.algorithms

class NumberOfMatchingSubsequencesTest extends AlgorithmsTest {
  "NumberOfMatchingSubsequences" should "pass basic test" in {
    NumberOfMatchingSubsequences.numMatchingSubseq("abcde", Array("a", "bb", "acd", "ace")) should be (3)
    NumberOfMatchingSubsequences.numMatchingSubseq("qlhxagxdqh", Array("qlhxagxdq","qlhxagxdq",
      "lhyiftwtut","yfzwraahab")) should be (2)
  }
}
