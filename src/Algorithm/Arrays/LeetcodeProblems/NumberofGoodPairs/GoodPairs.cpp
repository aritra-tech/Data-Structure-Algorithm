#include <bits/stdc++.h>
using namespace std;

int numIdenticalPairs(vector<int>& nums) 
{
       int res = 0;
       for(int i=0;i<nums.size();i++)
           for(int j=i+1;j<nums.size();j++)
               if(nums[i]==nums[j]) res++;
               
       return res;
}
int main() 
{
    vector<int> nums={1,2,3,1,1,3};
  
  cout<<numIdenticalPairs(nums)<<endl;
  return 0; 
}