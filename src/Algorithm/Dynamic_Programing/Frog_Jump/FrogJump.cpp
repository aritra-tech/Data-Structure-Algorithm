//  Approach -1 Recursion

#include<bits/stdc++.h>
using namespace std;

int jumps(vector<int> &heights,int idx,int n)
{
    if(idx==0) return 0; //if it's on stair 0 then there is no energy used
    
    int first=INT_MAX,second=INT_MAX;
    if(idx-1>=0)first=jumps(heights,idx-1,n)+abs(heights[idx]-heights[idx-1]);
    if(idx-2>=0)second=jumps(heights,idx-2,n)+abs(heights[idx]-heights[idx-2]);
    
    int ans=min(first,second);
    return ans;
}
int frogJump(int n, vector<int> &heights)
{
    return jumps(heights,n-1,n);
}

/*
Time Complexity:O(2^N)
Space Complexity: O(N) because of recursion stack space
*/


//  Approach -2 Memoization

#include<bits/stdc++.h>
using namespace std;

int jumps(vector<int> &heights,int idx,int n,vector<int>&dp)
{
    if(idx==0) return 0;
    if(dp[idx]!=-1 ) return dp[idx];
    int first=INT_MAX,second=INT_MAX;
    if(idx-1>=0)first=jumps(heights,idx-1,n,dp)+abs(heights[idx]-heights[idx-1]);
    if(idx-2>=0)second=jumps(heights,idx-2,n,dp)+abs(heights[idx]-heights[idx-2]);
    
    return dp[idx]=min(first,second);
   
}
int frogJump(int n, vector<int> &heights)
{
    vector<int>dp(n,-1);
    return jumps(heights,n-1,n,dp);
}

/*
Time Complexity:O(N)
Space Complexity: O(N) because of recursion stack space & vector 
*/


//  Approach -3 Tabulation

#include<bits/stdc++.h>
using namespace std;
int frogJump(int n, vector<int> &heights)
{
    vector<int>dp(n,-1);
    int first=INT_MAX,second=INT_MAX;
    dp[0]=0;
    for(int i=1;i<n;i++)
    {
         first=dp[i-1]+abs(heights[i]-heights[i-1]);
        if(i-2>=0) second=dp[i-2]+abs(heights[i]-heights[i-2]);
        
        dp[i]=min(first,second);
    }
    return dp[n-1];
}

/*
Time Complexity:O(N)
Space Complexity: O(N) because of vector
*/


// Approach -4 Space Optimization

#include<bits/stdc++.h>
using namespace std;
int frogJump(int n, vector<int> &heights)
{
    int prev=0,prev2=0,curr;
    int first=INT_MAX,second=INT_MAX;
    for(int i=1;i<n;i++)
    {
        first=prev+abs(heights[i]-heights[i-1]);
        if(i>=2)second=prev2+abs(heights[i]-heights[i-2]);
        
        curr=min(first,second);
        prev2=prev;
        prev=curr;
    }
    return prev;
}

/*
Time Complexity: O(N)
Space Complexity: O(1) 
*/