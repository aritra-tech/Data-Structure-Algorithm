package Algorithm.Arrays.LeetcodeProblems.MaximumProfitInJobScheduling;
import java.util.*;

public class MaximumProfit {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for(int i=0;i<n;i++){
            jobs[i] = new int[] {startTime[i],endTime[i],profit[i]};
        }
        Arrays.sort(jobs,(a,b)->a[1]-b[1]);
        int[] dp = new int[n];
        dp[0] = jobs[0][2];
        for(int i=1;i<n;i++){
            dp[i] = dp[i-1];
            int l = 0,r = i - 1,prev = 0;
            while(l<=r){
                int mid = (l+r)/2;
                if(jobs[mid][1]<=jobs[i][0]){
                    prev = dp[mid];
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
            dp[i] = Math.max(dp[i],jobs[i][2]+prev);
        }
        return dp[n-1];
    }
}

// Time Complexity : O(nlogn)
// Space Complexity : O(n)

