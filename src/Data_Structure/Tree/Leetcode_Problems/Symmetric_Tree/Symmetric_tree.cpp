class Solution {
public:
    bool isSymmetric(TreeNode* root) {
        return dfs(root->left, root->right);
    }
    bool dfs(TreeNode* l, TreeNode* r) {

        if(!l ^ !r) return 0;
        if(!l && !r) return 1;
        if(l->val != r->val) return 0;
        return dfs(l->left, r->right) && dfs(l->right, r->left);
    }
};
