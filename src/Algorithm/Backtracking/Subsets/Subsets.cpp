class Solution {
public:
    
    //function to find all possible subsets of nums
    void findSubsets(int currentIndex,vector<int>&nums,vector<int>&currAns,vector<vector<int>>&ans)
    {
        //base condition
        //if we have crossed the end of nums,then we are with one possible subset
        //so add it to ans
        if(currentIndex >= nums.size())
        {
            ans.push_back(currAns);
            return;
        }
        
        //we will explore the two possibilities
        
        //TAKE the current element of nums
        currAns.push_back(nums[currentIndex]);
        findSubsets(currentIndex+1,nums,currAns,ans);
        
        //NOT TAKE the current element of nums
        currAns.pop_back();//we have to undo the change that we made earlier
        findSubsets(currentIndex+1,nums,currAns,ans);
    }
    vector<vector<int>> subsets(vector<int>& nums)
    {
        vector<vector<int>>ans;//to store all the possible subsets 
        vector<int>currAns;
        
        findSubsets(0,nums,currAns,ans);
        
        return ans;
    }
};