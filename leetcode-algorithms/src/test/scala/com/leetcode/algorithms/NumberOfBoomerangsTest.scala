package com.leetcode.algorithms

class NumberOfBoomerangsTest extends AlgorithmsTest {
  "NumberOfBoomerangs" should "pass basic test case" in {
    NumberOfBoomerangs.numberOfBoomerangs(Array(Array(0, 0), Array(1, 0), Array(2, 0))) should be (2)
  }
}
