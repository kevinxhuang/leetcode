package com.leetcode.algorithms

class DecodeStringTest extends AlgorithmsTest {
  "DecodeString" should "pass basic test case" in {
    DecodeString.decodeString("3[a]2[bc]") shouldBe "aaabcbc"
    DecodeString.decodeString("3[a2[c]]") shouldBe "accaccacc"
    DecodeString.decodeString("2[abc]3[cd]ef") shouldBe "abcabccdcdcdef"
    DecodeString.decodeString("10[abc]") shouldBe "abcabcabcabcabcabcabcabcabcabc"
  }
}
