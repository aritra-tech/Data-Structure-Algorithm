/**
 * <br> Problem Statement :
 *
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 *
 * Example 1 :
 *
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 *
 * </br>
 *
 */

package DSA.Array;

import java.util.Arrays;
public class kth_largest_element {

    public static void main(String[] args) {
        int[] nums = { 3,2,1,5,6,4 };
        int k = 2;
        findKthLargest(nums,k);
        System.out.print("K'th smallest element is " + findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
