package DSA.Dynamic_Programing.Climbing_Stairs; /**
 * <br> Problem Statement :
 *
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * ex.
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 *
 * </br>
 *
 */


import java.util.Scanner;

public class ClimbingStairs_Tabulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stairs:");
        int n = sc.nextInt();
        climbStairs(n);
        System.out.println("Number of ways ="+climbStairs(n));
    }

    private static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

/**
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
