/* Approach

 We will keep storing the sum of elements in the hashmap along with the freq of sum

 Steps:
--Firstly add the element in the sum
-- then check if sum is equal to k(target sum) then we got a subarray hence increase count
-- find if sum-k is already present in map means there is already a subarray with the required sum , if it is present then add the freq of that element from map
-- atlast store the sum of elements in the map along with the freq

*/


class Solution {
public:
    int subarraySum(vector<int>& nums, int k) {
        unordered_map<int,int>mp;
        int sum=0,count=0;
        for(int i=0;i<nums.size();i++)
        {
            sum+=nums[i];
            if(sum==k) {count++;}
            if(mp.find(sum-k)!=mp.end())
            {
                count+= mp[sum-k];
            }
              mp[sum]++;
        }
        return count;
    }
};