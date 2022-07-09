package DSA.Dynamic_Programing.UniquePath;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePath_Tabulation {
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
        int dp[][]=new int[m][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return Ways(m,n,dp);
    }

    private static int Ways(int m, int n, int[][] dp) {
        for(int i=0; i<m ;i++){
            for(int j=0; j<n; j++){
                //base condition
                if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }
                int up=0;
                int left = 0;
                if(i>0)
                    up = dp[i-1][j];
                if(j>0)
                    left = dp[i][j-1];

                dp[i][j] = up+left;
            }
        }

        return dp[m-1][n-1];
    }
}

/**
 * Time Complexity - o(M*N) for two nested loop
 * Space Complexity - O(M*N)
 * */