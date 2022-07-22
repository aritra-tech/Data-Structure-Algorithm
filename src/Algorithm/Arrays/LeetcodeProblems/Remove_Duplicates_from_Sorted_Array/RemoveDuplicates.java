package Algorithm.Arrays.LeetcodeProblems.Remove_Duplicates_from_Sorted_Array;

public class RemoveDuplicates {
    public static void main(String[] args){

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i-1])
                nums[i++] = n;
        return i;
    }
}
