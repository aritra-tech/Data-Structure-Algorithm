package Data_Structure.Queue.Leetcode_Problems.Find_The_Winner;

public class FindTheWinner {
    public int findTheWinner(int n, int k) {
             return findWinnerHelper(n, k - 1) + 1;
         }
         
         private int findWinnerHelper(int n, int k) {
             if (n == 1) {
                 return 0;
             }
             
             return ((k + 1) % n + findWinnerHelper(n - 1, k)) % n;       
         }
}

// Time Complexity : O(1)
// Space Complexity : O(1)
