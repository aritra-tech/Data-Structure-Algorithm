/**
 * <br> Problem Statement :
 *
 * The frog is allowed to jump up to ‘K’ steps at a time.
 * If K=4, the frog can jump 1,2,3, or 4 steps at every index.
 *
 * Input:
 * 5 3
 * 10 30 40 50 20
 * Output:
 * 30
 *
 * Explanation:
 * If we follow the path 1 → 2 → 5, the total cost incurred would be ∣10−30∣+∣30−20∣ = 30.
 * </br>
 */



package DSA.Dynamic_Programing.FrogJumpwithkdistance;

import java.util.Arrays;
import java.util.Scanner;

public class FrogJumpwithkdistance_Memoization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int k=2;
        System.out.println(solve(n-1,height,k));
    }

    private static int solve(int n, int[] height,int k) {
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return solveUtil(n-1, height, dp, k);
    }

    private static int solveUtil(int ind, int[] height, int[] dp, int k) {
        if(ind==0) return 0;
        if(dp[ind]!=-1) return dp[ind];

        int mmSteps = Integer.MAX_VALUE;

        for(int j=1;j<=k;j++){
            if(ind-j>=0){
                int jump = solveUtil(ind-j, height, dp, k)+ Math.abs(height[ind]-
                        height[ind-j]);
                mmSteps= Math.min(jump, mmSteps);
            }
        }
        return dp[ind]= mmSteps;
    }
}

/**
 * Time Complexity - O(N*K)
 * Space Complexity - O(N)
 * */

