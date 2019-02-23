package com.leetcode.algorithms

class RedundantConnectionTest extends AlgorithmsTest {
  "RedundantConnection" should "pass basic test" in {
    RedundantConnection.findRedundantConnection(Array(Array(1, 2), Array(1, 3), Array(2, 3))) should be (Array(2, 3))
    RedundantConnection.findRedundantConnection(Array(Array(1, 2), Array(2, 3), Array(3, 4), Array(1, 4), Array(1, 5))) should be (Array(1, 4))
    RedundantConnection.findRedundantConnection(Array(Array(3, 4), Array(1, 2), Array(2, 4), Array(3, 5), Array(2, 5))) should be (Array(2, 5))
  }
}
