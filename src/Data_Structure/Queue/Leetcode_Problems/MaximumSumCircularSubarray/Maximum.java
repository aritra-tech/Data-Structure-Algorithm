package Data_Structure.Queue.Leetcode_Problems.MaximumSumCircularSubarray;

public class Maximum {
    public int maxSubarraySumCircular(int[] nums) {
          int totalSum = 0;
          int currMaxSum = 0;
          int currMinSum = 0;
          int maxSum = Integer.MIN_VALUE;
          int minSum = Integer.MAX_VALUE;
      
          for (int a : nums) {
            totalSum += a;
            currMaxSum = Math.max(currMaxSum + a, a);
            currMinSum = Math.min(currMinSum + a, a);
            maxSum = Math.max(maxSum, currMaxSum);
            minSum = Math.min(minSum, currMinSum);
          }
      
          return maxSum < 0 ? maxSum : Math.max(maxSum, totalSum - minSum);
        }
}

// Time Complexity: O(n)
// Space Complexity: O(n)
