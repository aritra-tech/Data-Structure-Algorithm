// Problem link - (https://leetcode.com/problems/total-hamming-distance/)

class Solution
{
public:
int totalHammingDistance(vector<int>& nums)
{
    int ans = 0;
    for(int bit = 0;bit <32;bit++)
    {
        int zeros = 0;
        int ones = 0;
        for(auto ele : nums)
        {
            if(ele & (1<<bit)
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
};
