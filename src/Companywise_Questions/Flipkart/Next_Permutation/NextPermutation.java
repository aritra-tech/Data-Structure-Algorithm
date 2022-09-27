package Companywise_Questions.Flipkart.Next_Permutation;

public class NextPermutation {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        nextPermutation(nums);
    }

    private static void nextPermutation(int[] nums) {
        if(nums == null || nums.length <= 1)
            return;
        int i = nums.length - 2;
        while(i >= 0 && nums[i] >= nums[i + 1]) i--;
        if(i >= 0) {
            int j = nums.length - 1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, nums.length - 1);
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums, int i, int j){
        while(i < j){
            swap(nums,i++,j--);
        }
    }
}
