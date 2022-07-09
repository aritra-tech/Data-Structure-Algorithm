/**
 * <br> Problem Statement :
 *
 * There is a frog on the 1st step of an N stairs long staircase. The frog wants to reach the Nth stair.
 * HEIGHT[i] is the height of the (i+1)th stair.
 * If Frog jumps from ith to jth stair, the energy lost in the jump is given by |HEIGHT[i-1] - HEIGHT[j-1] |.
 * In the Frog is on ith staircase,he can jump either to (i+1)th stair or to (i+2)th stair.
 * Your task is to find the minimum total energy used by the frog to reach from 1st stair to Nth stair.
 *
 * ex.
 * If the given ‘HEIGHT’ array is [10,20,30,10], the answer 20 as the frog can jump from 1st stair to 2nd stair
 * (|20-10| = 10 energy lost) and then a jump from 2nd stair to last stair (|10-20| = 10 energy lost).
 * So, the total energy lost is 20.
 *
 * </br>
 *
 */


package DSA.Dynamic_Programing.Frog_Jump;

import java.util.Arrays;
import java.util.Scanner;

public class FrogJump_Memoization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height[]={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        System.out.println(solve(n-1,height,dp));
    }

    private static int solve(int i, int[] height, int[] dp) {
        if (i==0){
            return 0;
        }
        if (dp[i]!=-1){
            return dp[i];
        }
        int jump2 = Integer.MAX_VALUE;
        int jump1 =  solve(i-1,height,dp) + Math.abs(height[i]-height[i-1]);
        if (i>1){
            jump2 = solve(i-2,height,dp) + Math.abs(height[i]-height[i-2]);
        }
        return dp[i] = Math.min(jump1,jump2);
    }
}

/**
 * Time Complexity - o(N)
 * Space Complexity - O(N) [We are using a recursion stack space(O(N)) and an array (again O(N)). Therefore total space complexity will be O(N) + O(N) ≈ O(N)]
 * */
