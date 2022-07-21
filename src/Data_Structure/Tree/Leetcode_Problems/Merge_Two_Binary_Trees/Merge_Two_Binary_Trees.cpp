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
    TreeNode* mergeTrees(TreeNode* root1, TreeNode* root2) {
	//If any node is NULL then return the other root node there
        if(!root2) return root1;
        if(!root1) return root2;

        //Merge left nodes
        root1->left = mergeTrees(root1->left, root2->left);
        //Merge right nodes
        root1->right = mergeTrees(root1->right, root2->right);

        //Add both the values
        root1 ->val = root1->val + root2->val;
        return root1;
    }
};
