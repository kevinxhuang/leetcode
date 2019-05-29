package com.leetcode.algorithms

class MergeSortedArrayTest extends AlgorithmsTest {
  "MergeSortedArray" should "pass basic test" in {
    val nums1 = Array(1,2,3,0,0,0)
    val nums2 = Array(2,5,6)
    MergeSortedArray.merge(nums1, 3, nums2, 3)
    nums1 shouldBe Array(1,2,2,3,5,6)
  }

  "MergeSortedArray" should "pass test case with zero in array" in {
    val nums1 = Array(-1,0,0,3,3,3,0,0,0)
    val nums2 = Array(1,2,2)
    MergeSortedArray.merge(nums1, 6, nums2, 3)
    nums1 shouldBe Array(-1,0,0,1,2,2,3,3,3)
  }
}
