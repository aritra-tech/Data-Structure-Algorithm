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

public class ClimbingStairs_SpaceOptimization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        int n = sc.nextInt();
        climbStairs(n);
        System.out.println("Number of ways = "+climbStairs(n));
    }

    private static int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int prev1 = 1;
        int prev2 = 2;

        for (int i = 3; i <= n; i++) {
            int newValue = prev1 + prev2;
            prev1 = prev2;
            prev2 = newValue;
        }

        return prev2;
    }
}

/**
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
