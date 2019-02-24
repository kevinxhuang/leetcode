package com.leetcode.algorithms

/**
  * 482. License Key Formatting
  *
  * https://leetcode.com/problems/license-key-formatting
  */
object LicenseKeyFormatting {
  def licenseKeyFormatting(S: String, K: Int): String = {
    val licenseString = S.toUpperCase().split("-").mkString
    if(licenseString.length <= K) {
      licenseString
    } else {
      val group = licenseString.length / K
      val firstGroup = licenseString.substring(0, licenseString.length - group * K)
      (firstGroup :: licenseString.substring(firstGroup.length).grouped(K).toList).filter(_.nonEmpty).mkString("-")
    }
  }
}
