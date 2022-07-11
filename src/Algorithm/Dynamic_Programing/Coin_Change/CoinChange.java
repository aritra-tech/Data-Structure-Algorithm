package Algorithm.Dynamic_Programing.Coin_Change;

public class CoinChange {
    public static void main(String[] args){
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins,amount));
    }

    private static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        for(int i=1;i<dp.length;i++){
            dp[i] = dp.length;
            for (int c:coins){
                if (i >= c){
                    dp[i] = Math.min(dp[i], dp[i-c]+1);
                }
            }
        }
        return dp[amount] == dp.length ? -1 : dp[amount];
    }
}
