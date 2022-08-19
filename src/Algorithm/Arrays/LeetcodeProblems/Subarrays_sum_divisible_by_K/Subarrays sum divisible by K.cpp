/* Approach
Here we will store the sum of elements remainder when divided by K

Steps: 
-- Firstly remainder will be 0 so store it in map with its count as 1, as when rem of 1st subarray will be 0 then we can add the count of 0 as it will already be present in map.

-- then find the remainder of sum by dividing k

--if rem is less than 0 then simply add k in it , suppose sum =-7 and k=3 so now  rem =-7%3
which will be rem =-1 now if we add k in it means rem = -1+3 then rem=2 as there is already a diff of 3 btwn -1 and 2 (-1 0 1 2)

-- if rem already exist in map then add the frequency of rem in count.
and update the rem and its freq in map

*/


class Solution {
public:
    int subarraysDivByK(vector<int>& nums, int k) {
        int sum=0,count=0,rem=0;
        unordered_map<int,int>mp;
        mp[rem]=1;
        for(int i=0;i<nums.size();i++)
        {
            sum+=nums[i];
             rem=sum%k;
            if(rem<0)
            {
                rem+=k;
            }
            if(mp.find(rem)!=mp.end())
            {
                count+=mp[rem];
            }
            mp[rem]++;
        }
        return count;
    }
};