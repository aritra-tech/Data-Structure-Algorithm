package Algorithm.Dynamic_Programing.BuyandSellStocksII;

import java.util.Arrays;

public class buyandsellstocksII {
    public static void main(String[] args){

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {

        int n = prices.length;

        int[][] dp = new int[n+1][2];
        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        // Base condition
        dp[n][0] = dp[n][1] = 0;
        int profit = 0;
        for(int index = n-1; index>=0; index--){
            for (int buy=0; buy<=1; buy++){
                if (buy == 0){  // we can buy stocks
                    profit = Math.max(-prices[index] + dp[index+1][1], dp[index + 1][0]);
                }
                if (buy == 1){   // we can sell stocks
                    profit = Math.max(prices[index] + dp[index+1][0], dp[index+1][1]);
                }
                dp[index][buy] = profit;
            }
        }
        return dp[0][0];
    }
}


// 0 -> means buy stocks on that day
// 1 -> we cannot buy stocks on that day, but we can sell the stocks