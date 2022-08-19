/*
Approach 1 - Recursion
*/

class Solution {
public:
    
    int maxMoney(vector<int>&v,int idx)
    {
        if(idx==0) return v[idx];
        if(idx<0) return 0;
        
        int pick=0,nonpick=0;
        
        pick=v[idx]+maxMoney(v,idx-2);
        nonpick=0+maxMoney(v,idx-1);
        
        int ans=max(pick,nonpick);
        return ans;
    }
    int rob(vector<int>& nums) {
        int n=nums.size();
        if(n==1) return nums[0];
        vector<int>v1;
        vector<int>v2;
        for(int i=0;i<n;i++)
        {
            if(i!=0) v1.push_back(nums[i]);
            if(i!=n-1) v2.push_back(nums[i]);
        }
        return max(maxMoney(v1,v1.size()-1),maxMoney(v2,v2.size()-1));
    }
};

/*
Time Complexity:O(2^N)
Space Complexity: O(N)
*/


/*
Approach 2- Memoization
*/

class Solution {
public:
    int maxsum(vector<int>&v,vector<int>&dp,int idx)
    {
        if(idx==0) return v[0];
        if(idx<0) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int pick=0,nonpick=0;
        pick=v[idx]+maxsum(v,dp,idx-2);
        nonpick=0+maxsum(v,dp,idx-1);
        return dp[idx]= max(pick,nonpick);
    }
    int rob(vector<int>& nums) {
        int n=nums.size();
        if(n==1) return nums[0];
        vector<int>v1,v2;
        vector<int>dp1(n,-1),dp2(n,-1);
        for(int i=0;i<n;i++)
        {
            if(i!=0) v1.push_back(nums[i]);
            if(i!=n-1)v2.push_back(nums[i]);
        }
        return max (maxsum(v1,dp1,n-2),maxsum(v2,dp2,n-2));
    }
};

/*
Time Complexity:O(N)
Space Complexity:O(N)
*/


/*
Approach 3 - Tabulation
*/

class Solution {
public:
    
    int maxMoney(vector<int>& nums,int left,int right,vector<int>&dp)
    {
        dp[0]=0; //we kept it as 0 because we have two diff cases here in (1,n-1) we will not consider indx 0
        
        int pick=0,nonpick=0;
        for(int i=left;i<=right;i++)
        {
            pick=nums[i];
            if(i-2>=0) pick+=dp[i-2];
            if(i-1>=0)nonpick=0+dp[i-1];
            
            dp[i]=max(pick,nonpick);
        }
        return dp[right];
    }
    int rob(vector<int>& nums) {
        int n=nums.size();
        vector<int>dp(n,-1);
        if(n==1) return nums[0];
        if(n==2) return max(nums[0],nums[1]);
        return max(maxMoney(nums,0,n-2,dp),maxMoney(nums,1,n-1,dp));
    }
};

/*
Time Complexity:O(N)
Space Complexity:O(N)  //dp vector used + recursion stack space
*/


/*
Approach 4 - Space Optimization
*/

class Solution {
public:
    
    int maxMoney(vector<int>& nums,int left,int right)
    {
        int prev=0,prev2=0,curr;
        int pick=0,nonpick=0;
        
        for(int i=left;i<=right;i++)
        {
            pick=nums[i]+prev2;
            nonpick=0+prev;
            curr=max(pick,nonpick);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    int rob(vector<int>& nums) {
        int n =nums.size();
        if(n==1) return nums[0];
        if(n==2) return max(nums[0],nums[1]);
        return max(maxMoney(nums,0,n-2),maxMoney(nums,1,n-1));
    }
};

/*
Time Complexity:O(N)
Space Complexity:O(N) // recursion space otherwise it's O(1)
*/