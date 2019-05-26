package com.leetcode.algorithms

class SearchA2DMatrixIITest extends AlgorithmsTest {
  "SearchA2DMatrixII" should "pass basic test" in {
    val matrix = Array(
      Array(1, 4, 7, 11, 15),
      Array(2, 5, 8, 12, 19),
      Array(3, 6, 9, 16, 22),
      Array(10, 13, 14, 17, 24),
      Array(18, 21, 23, 26, 30))

    SearchA2DMatrixII.searchMatrix(matrix,5) shouldBe true
    SearchA2DMatrixII.searchMatrix(matrix,20) shouldBe false
  }
}
