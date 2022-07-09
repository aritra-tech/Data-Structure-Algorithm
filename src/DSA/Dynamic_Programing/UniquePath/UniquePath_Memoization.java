/**
 * <br> Problem Statement :
 *
 * There is a robot on an m x n grid. The robot is initially located at the top-left corner (i.e., grid[0][0]).
 * The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
 * Given the two integers m and n, return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 *
 * The test cases are generated so that the answer will be less than or equal to 2 * 10^9.
 *
 *  Input: m = 3, n = 2
 *  Output: 3
 *  Explanation: From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 *  1. Right -> Down -> Down
 *  2. Down -> Down -> Right
 *  3. Down -> Right -> Down
 *
 *  </br>
 *
 *  */





package DSA.Dynamic_Programing.UniquePath;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePath_Memoization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.print("Enter the value of m : ");
        m = sc.nextInt();
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        System.out.println(countWays(m,n));
    }

    private static int countWays(int m, int n) {
        int dp[][] = new int [m][n];
        for(int[] r : dp){
            Arrays.fill(r,-1);
        }
        return ways(m-1,n-1,dp);
    }

    private static int ways(int i, int j, int[][] dp) {
        if (i==0 && j==0){
            return 1;
        }
        if(i<0 || j<0){
            return 0;
        }
        if (dp[i][j]!=-1) return dp[i][j];

        int up = ways(i-1,j,dp);
        int down = ways(i,j-1,dp);

        return dp[i][j] = up+down;
    }
}

/**
 * Time Complexity - o(M*N)
 * Space Complexity - O((N-1)+(M-1)) + O(M*N)
 * */
