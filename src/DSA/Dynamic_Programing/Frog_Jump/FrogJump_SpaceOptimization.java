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

public class FrogJump_SpaceOptimization {
    public static void main(String[] args){
        int height[] = {30,10,60,10,60,50};
        int n = height.length;
        int prev=0,prev2=0;
        for(int i=1;i<n;i++){
            int jumptwo = Integer.MAX_VALUE;
            int jumpone = prev + Math.abs(height[i] - height[i-1]);
            if (i>1){
                jumptwo = prev2 + Math.abs(height[i] - height[i-2]);
            }
            int curr = Math.min(jumpone,jumptwo);
            prev2 = prev;
            prev = curr;
        }
        System.out.println(prev);
    }
}

/**
 * Time Complexity - o(N)
 * Space Complexity - O(1) [No extra space is required in the approach]
 * */
