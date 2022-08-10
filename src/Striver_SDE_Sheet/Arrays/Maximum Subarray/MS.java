/*Approach

1. First look at the given statements and approach to the solution part.
2. We are given with an integer array nums.
3. Next find the contiguous subarray.
4. Look that it should contain at least one number.
5. Find the subarray which should have the largest sum.
6. And Finally return the sum.

Example 1:
		Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
		Output: 6
		Explanation: [4,-1,2,1] has the largest sum = 6.

Example 2:
		Input: nums = [1]
		Output: 1

*/

package Striver_SDE_Sheet.Arrays.Maximum_Subarray;

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


// Time Complexity: O(n)
// Space Complexity: O(1)

