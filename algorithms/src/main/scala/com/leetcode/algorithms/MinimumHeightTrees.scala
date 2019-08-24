package com.leetcode.algorithms

/**
  * 310. Minimum Height Trees
  *
  * https://leetcode.com/problems/minimum-height-trees/
  */
object MinimumHeightTrees {
  def findMinHeightTrees(n: Int, edges: Array[Array[Int]]): List[Int] = {
    val edgeMatrix = Array.ofDim[Boolean](n , n)
    edges.foreach(edge => {
      edgeMatrix(edge.head)(edge.last) = true
      edgeMatrix(edge.last)(edge.head) = true
    })
    val degrees = new Array[Int](n)
    edges.foreach(edge => {
      degrees(edge.head) +=1
      degrees(edge.last) +=1
    })

    val removedFlag = new Array[Boolean](n)
    while(removedFlag.contains(false)) {
      val leaves = degrees.zipWithIndex.filter(_._1 == 1).map(_._2)
      leaves.foreach(leaf => {
        degrees(leaf) -= 1
        edgeMatrix(leaf).zipWithIndex.filter(_._1 == true).map(_._2).foreach(parent => {
          degrees(parent) -= 1
          edgeMatrix(leaf)(parent) = false
          edgeMatrix(parent)(leaf) = false
        })
        removedFlag(leaf) = true
      })

      if(removedFlag.count(_ == false ) == 1) {
        return List(removedFlag.indexWhere(_ == false))
      } else if(degrees.forall(_ <= 0)) {
        return leaves.toList
      }
    }

    List.empty
  }
}
