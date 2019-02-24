package com.leetcode.algorithms

class SimplifyPathTest extends AlgorithmsTest {
  "SimplifyPath" should "pass basic test" in {
    SimplifyPath.simplifyPath("/home/") should be ("/home")
    SimplifyPath.simplifyPath("/../") should be ("/")
    SimplifyPath.simplifyPath("/..") should be ("/")
  }
}