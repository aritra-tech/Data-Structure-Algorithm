package Striver_SDE_Sheet.Dynamic_Programming.Coin_Change;

import java.util.Arrays;

public class coinchange {
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins,amount));
    }

    private static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=0;i<=amount;i++){
            for(int j=0; j<coins.length; j++){
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i] , 1 + dp[i - coins[j]]);
                }else{
                    break;
                }
            }
        }
        if(dp[amount] > amount){
            return -1;
        }else{
            return dp[amount];
        }
    }
}
