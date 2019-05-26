package com.leetcode.algorithms

object SearchA2DMatrixII {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    if(matrix.isEmpty) {
      false
    } else {
      val rows = matrix.length
      val columns = matrix.head.length

      var i = 0
      var j = columns - 1
      while (i <= rows - 1 && j >= 0) {
        if (matrix(i)(j) == target) {
          return true
        } else if (matrix(i)(j) < target) {
          i = i + 1
        } else if (matrix(i)(j) > target) {
          j = j - 1
        }
      }

      false
    }
  }
}
