package com.leetcode.algorithms

class IntersectionOfTwoArraysIITest extends AlgorithmsTest {
  "IntersectionOfTwoArraysII" should "pass basic test 1" in {
    IntersectionOfTwoArraysII.intersect(Array(1,2,2,1), Array(2,2)) should contain theSameElementsAs Array(2,2)
  }

  "IntersectionOfTwoArraysII" should "pass basic test 2" in {
    IntersectionOfTwoArraysII.intersect(Array(4,9,5), Array(9,4,9,8,4)) should contain theSameElementsAs Array(4, 9)
  }
}
