package com.leetcode.algorithms

import com.leetcode.algorithms.util.AlgorithmsUtil


class AddTwoNumbersTest extends AlgorithmsTest {
  "AddTwoNumbers" should "pass basic test" in {
    val l1 = AlgorithmsUtil.createList(Array(2, 4, 3))
    val l2 = AlgorithmsUtil.createList(Array(5, 6, 4))
    AlgorithmsUtil.verifyList(AddTwoNumbers.addTwoNumbers(l1, l2), Array(7, 0, 8)) should be (true)
  }
}
