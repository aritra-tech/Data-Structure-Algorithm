/**
 * <br> Problem Statement :
 * Given n non-negative integers representing an elevation map where the
 * width of each bar is 1, compute how much water it can trap after raining.
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1].
 * In this case, 6 units of rain water (blue section) are being trapped.
 *
 *  </br>
 *
 *  */


// Most Asked Question in FAANG and other big tech companies

package DSA.Dynamic_Programing.TrappingRainWater;

import com.sun.source.tree.BreakTree;

import java.util.Scanner;

public class Trapping_Rain_Water {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(height));
    }

    private static int trap(int[] height) {
        int l = height.length;
        int answer = 0;
        int left[] = new int[l];
        int right[] = new int[l];
        left[0] = height[0];
        for (int i = 1; i < l; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        right[l - 1] = height[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i]);
        }
        for (int i = 0; i < l; i++) {
            answer += (Math.min(left[i], right[i]) - height[i]);
        }
        return answer;
    }
}
/**
 * Time Complexity - O(N)
 * Space Complexity - O(1)
 * */
