
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

#include <bits/stdc++.h>
#include <iostream>
#include <vector>
#include <queue>

using namespace std;

/// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

// BFS approach
class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {

        vector<vector<int>> res;
        if(root == NULL)
            return res;

        queue<TreeNode*> q;
        q.push(root);
        int level_num = 1;

        while(!q.empty()){

            int new_level_num = 0;
            vector<int> level;
            for(int i = 0; i < level_num; i ++){
                TreeNode* node = q.front();
                q.pop();
                level.push_back(node->val);

                if(node->left){
                    q.push(node->left);
                    new_level_num ++;
                }
                if(node->right){
                    q.push(node->right);
                    new_level_num ++;
                }
            }

            res.push_back(level);
            level_num = new_level_num;
        }

        return res;
    }
};


int main() {

    return 0;
}

// Time Complexity: O(n), where n is the number of nodes in the tree
// Space Complexity: O(n)
