package com.leetcode.algorithms

class CountAndSayTest extends AlgorithmsTest {
  "CountAndSay" should "pass basic test1" in {
    CountAndSay.countAndSay(1) shouldBe "1"
  }

  "CountAndSay" should "pass basic test2" in {
    CountAndSay.countAndSay(4) shouldBe "1211"
  }
}
