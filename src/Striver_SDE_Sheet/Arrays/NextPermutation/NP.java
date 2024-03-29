
package Striver_SDE_Sheet.Arrays.NextPermutation;

public class NP {

    public static void nextPermutation(int[] nums) {
        int idx = nums.length - 2;
        while (idx >= 0 && nums[idx + 1] <= nums[idx]) {
            idx--;
        }
        if (idx >= 0) {
            int endIdx = nums.length - 1;
            while (nums[endIdx] <= nums[idx]) {
                endIdx--;
            }
            swap(nums, idx, endIdx);
        }
        reverse(nums, idx + 1);
    }

    private static void reverse(int[] nums, int startIdx) {
        int endIdx = nums.length - 1;
        while (startIdx < endIdx) {
            swap(nums, startIdx, endIdx);
            startIdx++;
            endIdx--;
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}


