struct TreeNode {
      int val;
      TreeNode *left;
      TreeNode *right;
      TreeNode() : val(0), left(nullptr), right(nullptr) {}
      TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
      TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
  };

class Solution {
public:
    TreeNode* InsertIntoBST(TreeNode* root, int value) {
        if(root == NULL)
            return new TreeNode(value);
        if(root->value > value){
            root->left = InsertIntoBST(root->left,value);
            return root;
        }
        root->right = InsertIntoBST(root->right,value);
        return root;
    }
};
