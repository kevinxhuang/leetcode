package com.leetcode.algorithms

class UniquePathsIITest extends AlgorithmsTest {
  "UniquePathsII" should "pass basic test" in {
    UniquePathsII.uniquePathsWithObstacles(Array(Array(0,0,0), Array(0,1,0), Array(0,0,0))) shouldBe 2
  }

  "UniquePathsII" should "pass if only one cell grid" in {
    UniquePathsII.uniquePathsWithObstacles(Array(Array(0))) shouldBe 1
  }

  "UniquePathsII" should "pass if only one row grid" in {
    UniquePathsII.uniquePathsWithObstacles(Array(Array(0, 0))) shouldBe 1
  }

  "UniquePathsII" should "pass if there is obstacle in first row" in {
    UniquePathsII.uniquePathsWithObstacles(Array(Array(1, 0))) shouldBe 0
  }
}
