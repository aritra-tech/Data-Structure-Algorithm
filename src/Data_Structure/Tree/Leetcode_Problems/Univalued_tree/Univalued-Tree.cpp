class Solution {
public:
    bool isUnivalTree(TreeNode* root) {
        queue<TreeNode*> q;
        int value=root->val;
        q.push(root);
        while(!q.empty())
        {
            int n=q.size();
            while(n--)
            {
                TreeNode* start = q.front();
                if(start->val!=value)return false;   //solving constraint
                if(start->left!=NULL) q.push(q.front()->left);
                if(start->right!=NULL) q.push(q.front()->right);
                q.pop();
            }
        }
        return true;
    }
};
