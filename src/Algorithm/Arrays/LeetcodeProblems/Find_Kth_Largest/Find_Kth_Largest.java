package Algorithm.Arrays.LeetcodeProblems.Find_Kth_Largest;

import java.util.Arrays;

public class Find_Kth_Largest {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}