package com.leetcode.algorithms

/**
  * 1108. Defanging an IP Address
  */
object DefangingAnIPAddress {
  def defangIPaddr(address: String): String = {
    address.replace(".", "[.]")
  }
}
