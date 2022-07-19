class Solution {
public:
    vector<vector<int>> subsetsWithDup(vector<int>& nums)
    {
        vector<vector<int>> ans;
        vector<int> sub;
        
        // to get the duplicates together
        sort(nums.begin(), nums.end());
        
        getSubsets(nums, 0, sub, ans);
        
        return ans;
    }
    
    void getSubsets(vector<int>& nums, int i, vector<int>& sub, vector<vector<int>>& ans)
    {
        ans.push_back(sub);
        int n = nums.size();
        
        for(int j = i; j < n; ++j)
        {
            // skipping over the duplicates
            if(j != i && nums[j] == nums[j - 1])
                continue;
            sub.push_back(nums[j]);
            getSubsets(nums, j + 1, sub, ans);
            sub.pop_back();
        }
        
    }
};
