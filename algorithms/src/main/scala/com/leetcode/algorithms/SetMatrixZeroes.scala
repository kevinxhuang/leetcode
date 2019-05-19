package com.leetcode.algorithms

import scala.collection.mutable.ArrayBuffer

object SetMatrixZeroes {
  def setZeroes(matrix: Array[Array[Int]]): Unit = {
    val zeros = new ArrayBuffer[(Int, Int)]()
    val rows = matrix.length
    val cols = matrix.head.length
    for {
      i <- 0 until rows
      j <- 0 until cols
    } {
      if(matrix(i)(j) == 0) {
        zeros += ((i, j))
      }
    }

    zeros.foreach ({
      case (x ,y) => {
        for(i <- 0 until rows) matrix(i)(y) = 0
        for(j <- 0 until cols) matrix(x)(j) = 0
      }})
  }
}
