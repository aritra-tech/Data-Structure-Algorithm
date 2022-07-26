package Algorithm.Dynamic_Programing.BuyandSellStocks;

public class buysellstocks {
    public static void main(String[] args){
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    private static int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<prices.length;i++){
            buy = Math.min(buy,prices[i]);
            maxprofit = Math.max(maxprofit,prices[i]-buy);
        }
        return maxprofit;
    }

}
