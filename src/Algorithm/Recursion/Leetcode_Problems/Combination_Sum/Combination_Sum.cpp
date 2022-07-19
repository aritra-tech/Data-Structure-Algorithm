class Solution {
public:
    vector<vector<int>> combinationSum(vector<int>& candidates, int target)
    {
        vector<vector<int>> ans;
        vector<int> sub;
        getSubsets(candidates, 0, target, sub, ans);
        return ans;
    }

    void getSubsets(vector<int>& candidates, int i, int target, vector<int>& sub,           vector<vector<int>>& ans)
    {
        if(target == 0)
        {
            ans.push_back(sub);
            return;
        }
        
        if(target < 0)
            return;
        
        if(i == candidates.size())
            return;
        
        getSubsets(candidates, i + 1, target, sub, ans);
        sub.push_back(candidates[i]);
        
        getSubsets(candidates, i, target - candidates[i], sub, ans);
        sub.pop_back();
    }
};
