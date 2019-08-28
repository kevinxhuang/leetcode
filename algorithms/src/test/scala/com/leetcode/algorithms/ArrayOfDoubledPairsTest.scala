package com.leetcode.algorithms

class ArrayOfDoubledPairsTest extends AlgorithmsTest {
  "ArrayOfDoubledPairs" should "pass basic test 1" in {
    ArrayOfDoubledPairs.canReorderDoubled(Array(3,1,3,6)) shouldBe false
  }

  "ArrayOfDoubledPairs" should "pass basic test 2" in {
    ArrayOfDoubledPairs.canReorderDoubled(Array(2,1,2,6)) shouldBe false
  }

  "ArrayOfDoubledPairs" should "pass basic test 3" in {
    ArrayOfDoubledPairs.canReorderDoubled(Array(4,-2,2,-4)) shouldBe true
  }

  "ArrayOfDoubledPairs" should "pass basic test 4" in {
    ArrayOfDoubledPairs.canReorderDoubled(Array(1,2,4,16,8,4)) shouldBe false
  }

  "ArrayOfDoubledPairs" should "return false if input is empty " in {
    ArrayOfDoubledPairs.canReorderDoubled(Array()) shouldBe true
  }

  "ArrayOfDoubledPairs" should "pass test cast 1" in {
    ArrayOfDoubledPairs.canReorderDoubled(Array(-5, -3)) shouldBe false
  }

  "ArrayOfDoubledPairs" should "pass test cast 2" in {
    ArrayOfDoubledPairs.canReorderDoubled(Array(1,2,4,8)) shouldBe true
  }

  "ArrayOfDoubledPairs" should "pass test cast 3" in {
    ArrayOfDoubledPairs.canReorderDoubled(Array(-4,-6,-1,-2,-1,-1,-3,-8)) shouldBe false
  }
}
