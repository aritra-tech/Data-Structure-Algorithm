/*
Approach-1 Using Recursion  (It will give TLE on leetcode/coding ninjas)
*/

class Solution {
public:
    
    int maxMoney(vector<int>& nums,int idx)
    {
        if(idx==0) return nums[0];
        if(idx<0) return 0;
        int pick=0,notpick=0;
        
        pick=nums[idx]+maxMoney(nums,idx-2);
        notpick=0+maxMoney(nums,idx-1);
        
        int ans=max(pick,notpick);
        return ans;
    }
    int rob(vector<int>& nums) {
        int n=nums.size();
        return maxMoney(nums,n-1);
    }
};

/*
Time Complexity:O(2^N)
Space Complexity:O(N)
*/


/*
Approach-2 Using Memoization
*/

class Solution {
public:
    
    int maxMoney(vector<int>& nums,vector<int>&dp,int idx)
    {
        if(idx==0) return nums[0];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick=0,notpick=0;
        
        pick=nums[idx]+maxMoney(nums,dp,idx-2);
        notpick=0+maxMoney(nums,dp,idx-1);
        
         dp[idx]=max(pick,notpick);
        return dp[idx];
    }
    int rob(vector<int>& nums) {
        int n=nums.size();
        vector<int>dp(n+1,-1);
        return maxMoney(nums,dp,n-1);
    }
};

/*
Time Complexity:O(N)
Space Complexity:O(N) 
*/


/*
Approach-3 Using Tabulation
*/

class Solution {
public:
    int rob(vector<int>& nums) {
        int n=nums.size();
        vector<int>dp(n,-1);
        dp[0]=nums[0];
        int pick=0,nonpick=0;
        for(int i=1;i<n;i++)
        {
            pick=nums[i];
            if(i-2>=0) pick+=dp[i-2];
            nonpick=0+dp[i-1];
            
            dp[i]=max(pick,nonpick);
        }
        return dp[n-1];
    }
};

/*
Time Complexity:O(N)
Space Complexity:O(N)
*/


/*
Approach-4 Using Space Optimization
*/

class Solution {
public:
    int rob(vector<int>& nums) {
        int n=nums.size();
        int prev=nums[0],prev2=0,curr;
        int pick=0,nonpick=0;
        
        for(int i=1;i<n;i++ )
        {
            pick=nums[i]+prev2;
            nonpick=0+prev;
            
            curr=max(pick,nonpick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
};

/*
Time Complexity:O(N)
Space Complexity:O(1)
*/