package com.leetcode.algorithms

class AddBinaryTest extends AlgorithmsTest {
  "AddBinary" should "pass basic test" in {
    AddBinary.addBinary("11", "1") should be ("100")
    AddBinary.addBinary("1000000000000000000000000000000", "1") should be ("1000000000000000000000000000001")
  }
}
