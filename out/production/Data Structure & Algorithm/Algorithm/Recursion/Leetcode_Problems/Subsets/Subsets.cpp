class Solution {
public:
    vector<vector<int>> subsets(vector<int>& nums) {
        
        vector<vector<int>> ans;
        vector<int> sub;
        
        getSubsets(nums, 0, sub, ans);
        
        return ans;
    }
    
    void getSubsets(vector<int>& nums, int i, vector<int>& sub, vector<vector<int>>& ans)
    {
        if(i == nums.size())
        {
            ans.push_back(sub);
            return;
        }
        sub.push_back(nums[i]);
        // case: picking an element
        getSubsets(nums, i + 1, sub, ans);
        sub.pop_back();
        // case: not picking an element
        getSubsets(nums, i + 1, sub, ans);
    }
};
