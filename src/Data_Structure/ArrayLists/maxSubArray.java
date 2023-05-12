package Data_Structure.ArrayLists;

public class maxSubArray {
    public static void main(String[] args) {
        int []nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int curr = nums[0];
        int allmax = nums[0];
        for(int i = 1; i < nums.length; i++){
            curr = Math.max(nums[i], curr + nums[i]);
            allmax = Math.max(curr, allmax);
        }
        return allmax;
    }
}

// Time complexity 0(N)