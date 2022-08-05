class Solution
{
public:
    bool helper(TreeNode* root)
    {
	    // base case
        if(!root)
            return false;
        bool left=helper(root->left);
        bool right=helper(root->right);
		// pruning left subtree if it does not have 1
        if (!left)
            root->left=NULL;
        // pruning right subtree if it does not have 1
        if(!right)
            root->right=NULL;
		// if left and right subtree both does not have 1 and the current node is also 0 then this node should also be pruned
        if(!left && !right && root->val==0)
		{ return false; }
            return true;
    }
    TreeNode* pruneTree(TreeNode* root)
    {
        // if the whole tree does not contain 1, return null
        if(!helper(root))
           return NULL;
        return root;
    }
};
