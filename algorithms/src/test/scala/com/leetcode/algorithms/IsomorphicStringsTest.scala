package com.leetcode.algorithms

class IsomorphicStringsTest extends AlgorithmsTest {
  "IsomorphicStrings" should "pass basic test" in {
    IsomorphicStrings.isIsomorphic("egg", "add") should be (true)
    IsomorphicStrings.isIsomorphic("foo", "bar") should be (false)
    IsomorphicStrings.isIsomorphic("ab", "aa") should be (false)
    IsomorphicStrings.isIsomorphic("ab", "ca") should be (true)
  }
}
