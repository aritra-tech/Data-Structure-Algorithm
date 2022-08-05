//https://leetcode.com/problems/total-hamming-distance/

#include <bits/stdc++.h>
using namespace std;

int totalHammingDistance(vector<int>& nums)
{
    int ans = 0;
    for(int bit = 0;bit <32;bit++)
    {
        int zeros = 0;
        int ones = 0;
        for(auto ele : nums)
        {
            if(ele & (1<<bit))
            {
                ones++;
            }
            else
            {
                zeros++;
            }
        }
        ans = ans + (zeros*ones);
    }
    return ans;
}


int main()
{
    vector<int> nums1 = {4,14,2};
    cout << totalHammingDistance(nums1) << endl;
    vector<int> nums2 = {4,14,17,2};
    cout << totalHammingDistance(nums2) << endl;
    vector<int> nums3 = {4,14,4};
    cout << totalHammingDistance(nums3) << endl;

    return 0;
}
