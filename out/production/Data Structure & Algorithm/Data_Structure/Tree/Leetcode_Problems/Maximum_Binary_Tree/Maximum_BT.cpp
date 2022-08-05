 struct TreeNode {
      int val;
      TreeNode *left;
      TreeNode *right;
      TreeNode() : val(0), left(nullptr), right(nullptr) {}
      TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
      TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
  };

class Solution
{
public:
    TreeNode* constructMaximumBinaryTree(vector<int>& nums)
    {
        //we can get the max element in O(N) time
        TreeNode* root=Helper(0,nums.size()-1,nums);
        return root;
    }
    TreeNode* Helper(int start,int end,vector<int>& nums)
    {
        if(start>end)
            return NULL;
        //get the largest value between start and end along with its index
        int maximum=-1;
        int index=-1;
        for(int i=start;i<=end;i++)
        {
            if(nums[i]>maximum)
            {
                maximum=nums[i];
                index=i;
            }
        }
        TreeNode* curr=new TreeNode(nums[index]);
        //build the right sub tree
        curr->right=Helper(index+1,end,nums);
        //build the left sub tree
        curr->left=Helper(start,index-1,nums);
        return curr;
    }
};
