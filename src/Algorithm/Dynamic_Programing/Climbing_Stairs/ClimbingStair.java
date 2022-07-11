package Algorithm.Dynamic_Programing.Climbing_Stairs;

import java.util.Scanner;

public class ClimbingStair {
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
