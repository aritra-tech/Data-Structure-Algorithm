package Striver_SDE_Sheet.Dynamic_Programming.Longest_Increasing_Subsequence;

import java.util.Arrays;

public class LIS {
    public static void main(String[] args){
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));      // Tabulation Approach
        System.out.println(lengthOfLIS_memoization(nums));      // Memoization Approach
    }

    private static int lengthOfLIS_memoization(int[] nums) {
             int n = nums.length;
             int[][] dp = new int[n][n+1];
             for(int[] rows:dp){
                 Arrays.fill(rows,-1);
             }

             return length(nums,n,0,-1,dp);
         }
         public static int length(int[] nums, int n, int index, int prev_index, int[][] dp) {

             if (index == n) {
                 return 0;
             }

             if (dp[index][prev_index + 1] != -1) {
                 return dp[index][prev_index + 1];
             }

             int nottake = length(nums, n, index + 1, prev_index, dp);

             int take = 0;

             if (prev_index == -1 || nums[index] > nums[prev_index]) {

                 take = 1 + length(nums, n, index + 1, index, dp);
             }

             return dp[index][prev_index + 1] = Math.max(nottake, take);
         }

    private static int lengthOfLIS(int[] nums) {

        int n = nums.length;
        int[][] dp = new int[n+1][n+1];

        for(int index = n-1; index>=0; index--){
            for(int prev_index = index-1; prev_index>=-1; prev_index--){
                int notTake = dp[index + 1][prev_index + 1];

                int take = 0;

                if (prev_index == -1 || nums[index] > nums[prev_index]){

                    take = 1 + dp[index+1][prev_index+1];
                }
                dp[index][prev_index+1] = Math.max(notTake,take);
            }
        }
        return dp[0][0];
    }
}
