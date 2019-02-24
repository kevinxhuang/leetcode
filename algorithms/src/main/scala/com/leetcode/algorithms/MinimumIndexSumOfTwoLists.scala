package com.leetcode.algorithms

object MinimumIndexSumOfTwoLists {
  def findRestaurant(list1: Array[String], list2: Array[String]): Array[String] = {
    val list1WithIndex = list1.zipWithIndex.toMap
    val list2WithIndex = list2.zipWithIndex.toMap

    val commonElems = list1WithIndex.keySet & list2WithIndex.keySet
    if(commonElems.nonEmpty) {
      val commonElemsWithIndexSum = commonElems.map(elem => (elem, list1WithIndex(elem) + list2WithIndex(elem))).toArray.sortBy(_._2)
      commonElemsWithIndexSum.filter(_._2 == commonElemsWithIndexSum.head._2).map(_._1)
    } else {
      Array.empty[String]
    }
  }
}
