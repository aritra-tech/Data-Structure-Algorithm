/**
 * <br> Problem Statement :
 *
 * You are given an integer array coins representing coins of different denominations
 * and an integer amount representing a total amount of money.
 *
 * Return the fewest number of coins that you need to make up that amount.
 * If that amount of money cannot be made up by any combination of the coins, return -1.
 *
 * You may assume that you have an infinite number of each kind of coin.
 *
 * Example 1 :
 *
 * Input: coins = [1,2,5], amount = 11
 * Output: 3
 * Explanation: 11 = 5 + 5 + 1
 *
 * Example 2:
 *
 * Input: coins = [2], amount = 3
 * Output: -1
 *
 *  </br>
 *  */

// Asked in Amazon , Microsoft ,Google and Apple
package DSA.Dynamic_Programing.Coin_Change;


public class Coin_Change {
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.print(coinChange(coins,amount));
    }
    public static int coinChange(int[] coins, int amount){
        int[] dp = new int[amount + 1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp.length;
            for (int c : coins) {
                if (i >= c) {
                    dp[i] = Math.min(dp[i], dp[i - c] + 1);
                }
            }
        }
        return dp[amount] == dp.length ? -1 : dp[amount];
    }
}
