package com.leetcode.algorithms

/**
  * 322. Coin Change
  */
object CoinChange {
  def coinChange(coins: Array[Int], amount: Int): Int = {
    val dp = Array.fill(amount + 1)(amount + 1)
    dp(0) = 0

    (1 to amount).foreach(i => coins.filter(i - _ >= 0).foreach(j => dp(i) = dp(i).min(dp(i-j) + 1)))

    if(dp(amount) <= amount) {
      dp(amount)
    } else {
      - 1
    }
  }
}
