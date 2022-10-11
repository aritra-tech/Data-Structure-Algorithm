package Striver_SDE_Sheet.Dynamic_Programming.Partition_Equal_Subset_Sum;

public class subsetsum {
    public static void main(String[] args){
        int[] nums = {1,5,11,5};
        System.out.println(canPartition(nums));
    }

    private static boolean canPartition(int[] nums) {
        int sum = 0;
        int n = nums.length;

        for(int i : nums) {
            sum+=i;
        }
        if(sum%2!=0) {
            return false;
        }
        sum /= 2;
        boolean dp[][] = new boolean[n+1][sum+1];

        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(i==0 || j==0)
                    dp[i][j] = false;
                else if(nums[i-1] > j)     // if curr sum value is greater than the current element value then just skip(take previous value)
                    dp[i][j] = dp[i-1][j];
                else if(nums[i-1]==j)  // we got required sum
                    dp[i][j] = true;
                else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
            }
        }
        return dp[n][sum];
    }
}
