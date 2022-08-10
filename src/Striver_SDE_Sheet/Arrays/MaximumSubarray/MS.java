

package Striver_SDE_Sheet.Arrays.MaximumSubarray;

public class MS {
    public int maxSubArray(int[] nums) {
     int max1=nums[0],cur=0;
        for(int i :nums)
        {
            if(cur<0)
                cur=0;
            cur+=i;
            max1=Math.max(max1,cur);
        }
        return max1;
    }
}



