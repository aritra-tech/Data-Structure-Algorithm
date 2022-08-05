#include <bits/stdc++.h>
using namespace std;

vector<int> smallerNumbersThanCurrent(vector<int>& nums) 
{
    vector<int> ans;
    for(int i=0;i<nums.size();i++)
    {
        int val=nums.at(i),count=0;
        for(int j=0;j<nums.size();j++)
        {
            if(nums.at(j)<val)  count++;
        }
        ans.push_back(count);
    }
    return ans;
}
int main() 
{
    vector<int> nums{ 8 , 1, 2 , 2 , 3 }; 
    vector<int> ans=smallerNumbersThanCurrent(nums);
    
    for(auto val:ans) cout<<val<<" ";
    cout<<endl;
    
    return 0;  
}