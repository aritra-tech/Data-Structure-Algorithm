/* Approach

1. Look at the given statements in the question and then approach to the solution part.
2. We are given with an array prices.
3. Prices[i] is the price of a given stock on the ith day.
4. We can make sure the max profit at least be ZERO.
5. Now we want to maximize our profit by choosing a single day to buy one stock.
6. And then choose a different day in the future to sell that stock.
7. Look at the constraints 1 <= prices.length <= 105 and 0 <= prices[i] <= 104.
8. Finally now return the maximum profit we can achieve from this transaction.
9. If we cannot achieve any profit, return 0.

*/

package Striver_SDE_Sheet.Arrays.Best_Time;

public class BT {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for (int price : prices) {
          if (price < minPrice) {
            minPrice = price;
          }
          maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
      }
}

// Time Complexity: O(n)
// Space Complexity: O(1)