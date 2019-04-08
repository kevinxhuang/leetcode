package com.leetcode.algorithms

import com.leetcode.algorithms.util.AlgorithmsUtil

class MergeTwoSortedListsTest extends AlgorithmsTest {
  "MergeTwoSorted" should "pass basic test" in {
    val l1 = AlgorithmsUtil.createList(Array(1, 2, 4))
    val l2 = AlgorithmsUtil.createList(Array(1, 3, 4))

    AlgorithmsUtil.verifyList(MergeTwoSortedLists.mergeTwoLists(l1, l2), Array(1, 1, 2, 3, 4))
  }
}
