package Striver_SDE_Sheet.Dynamic_Programming.Maximum_Product_Subarray;

public class Product_Subarray {
    public static void main(String[] args){
        int[] nums = {2,3,-2,4};
        System.out.println(maxProduct(nums));
    }
    public static int maxProduct(int[] nums) {

        int max = nums[0] , min = nums[0] , answer = nums[0];
        for(int i=1;i<nums.length;i++){

            int x = max;
            max = Math.max(Math.max(max * nums[i], min * nums[i]), nums[i]);
            min = Math.min( Math.min(x * nums[i], min * nums[i]), nums[i]);

            if(max>answer){
                answer = max;
            }
        }
        return answer;
    }
}
