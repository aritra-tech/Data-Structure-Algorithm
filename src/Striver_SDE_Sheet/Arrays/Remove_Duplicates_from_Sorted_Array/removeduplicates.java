package Striver_SDE_Sheet.Arrays.Remove_Duplicates_from_Sorted_Array;

public class removeduplicates {
    public static void main(String[] args){
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {

        int a = 0;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != nums[a])
            {
                a++;
                nums[a] = nums[i];
            }
        }
        return a+1;
    }
}
