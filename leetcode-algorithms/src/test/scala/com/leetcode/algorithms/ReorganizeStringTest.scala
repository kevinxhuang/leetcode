package com.leetcode.algorithms

class ReorganizeStringTest extends AlgorithmsTest {
  "ReorganizeString" should "pass basic test" in {
    ReorganizeString.reorganizeString("aab") should be ("aba")
    ReorganizeString.reorganizeString("aaab") should be ("")
    ReorganizeString.reorganizeString("") should be ("")
    ReorganizeString.reorganizeString("aa") should be ("")
  }
}
