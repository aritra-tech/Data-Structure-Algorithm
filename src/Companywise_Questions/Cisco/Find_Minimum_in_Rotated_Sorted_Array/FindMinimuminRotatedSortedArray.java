package Companywise_Questions.Cisco.Find_Minimum_in_Rotated_Sorted_Array;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args){
        int[] nums = {3,4,5,1,2};
        System.out.println(findMin(nums));
    }

    private static int findMin(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(nums[start]>nums[end]){
            int mid = start+(end-start)/2;
            if(nums[mid]>=nums[start]) start=mid+1;
            else end=mid;
        }
        return nums[start];
    }
}
