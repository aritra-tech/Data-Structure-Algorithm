#include <bits/stdc++.h>
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
    vector<vector<int>> ans; // creating a 2-D vector to insert level order traversals
    
    vector<vector<int>> levelOrder(TreeNode* root) {
        preorder(root,0); // Calling Preorder Function to traverse the tree
        return ans;
    }
    void preorder(TreeNode* root, int level) {
        if (!root) {
            return;  // if node doesn't exists return None
        }
        if (ans.size()==level){
            ans.resize(ans.size()+1);  // Increment size of vector when level increased
        }
        ans[level].push_back(root->val);  // push value into 'level'-th index of vector
        preorder(root->left, level+1);      
        preorder(root->right, level+1);
    }
    
};