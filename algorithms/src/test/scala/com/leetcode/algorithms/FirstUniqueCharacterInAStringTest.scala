package com.leetcode.algorithms

class FirstUniqueCharacterInAStringTest extends AlgorithmsTest {
  "FirstUniqueCharacterInAString" should "pass basic test" in {
    FirstUniqueCharacterInAString.firstUniqChar("leetcode") should be (0)
    FirstUniqueCharacterInAString.firstUniqChar("loveleetcode") should be (2)
  }
}
