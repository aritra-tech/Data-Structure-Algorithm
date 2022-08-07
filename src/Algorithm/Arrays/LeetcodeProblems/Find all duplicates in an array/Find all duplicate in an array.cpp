// Approach-1

class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        unordered_map<int,int>mp;
        vector<int>ans;
        if(nums.size()==1) return ans;

        // storing all the elements and their count in map
        for(int i=0;i<nums.size();i++)
        {
            mp[nums[i]]++;
        }
        // now traversing in map whichever element's count is greater than 1 store that in ans vector
        for(auto it:mp)
        {
            if(it.second>1)
            {
                ans.push_back(it.first);
            }
        }
        return ans;
    }
};


/* Approach-2

Move through indexes and make them -ve as we traverse them and when we come on them again and they are -ve push them in the  ans

traverse and find the value of abs(nums[i])-1 for every index & check if that value is positive or not ,if it is negative then it means it's already present in array so store it as ans otherwise just make the value of that index as -ve
*/

class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int>ans;
        if(nums.size()==1) return ans;
        for(int i=0;i<nums.size();i++)
        {
             int s=abs(nums[i])-1;
            if(nums[s]<0)
            {
                ans.push_back(abs(nums[i]));
            }
            else
            {
               nums[s]= -nums[s];
            }
        }
        return ans;
    }
};