#include <bits/stdc++.h> 
using namespace std;

class Solution {

private: 
    int findMaxIndex(vector<int> &nums, int l, int r)
    {
        int maxI = l;

        for (int i = l; i<=r ; i++)
        {
            if(nums[i] >= nums[maxI])
                maxI = i;               
        }
        return maxI;
    }
    
    TreeNode* constructMaxSubtree(vector<int>& nums, int l, int r)//l, r are inclusive
    {
        if(l>r) return NULL;//not empty when l==r
        int maxI = findMaxIndex(nums, l, r); // this is max index so this nums will be root        
        TreeNode* root = new TreeNode(nums[maxI]);
        //Root is constructed now make children
        root->left = constructMaxSubtree(nums,l,maxI-1);
        root->right = constructMaxSubtree(nums, maxI+1,r);
        return root;
    }
    
public:
    TreeNode* constructMaximumBinaryTree(vector<int>& nums) {
        if(nums.size() == 0) return NULL;
        if(nums.size() == 1) return new TreeNode(nums[0]);
        TreeNode *maxTreeRoot;
        maxTreeRoot = constructMaxSubtree(nums,0,(nums.size()-1));
        return maxTreeRoot;
    }
};

// Time complexity : O(n^2)
// Space complexity : O(n)