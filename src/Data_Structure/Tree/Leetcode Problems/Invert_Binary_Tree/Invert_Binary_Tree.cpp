#include <iostream>

using namespace std;

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
    TreeNode* invertTree(TreeNode* root) {
        if(!root)
            return root;
        // Get Left Side of the Tree
        TreeNode *lft = invertTree(root->left);
        // Get Right Side of the Tree
        TreeNode *rght = invertTree(root->right);
        // Put Right Side to Left Side of the Tree
        root->left = rght;
        // Put Left Side to Right Side of the Tree
        root->right = lft;
        return root;
    }
};
