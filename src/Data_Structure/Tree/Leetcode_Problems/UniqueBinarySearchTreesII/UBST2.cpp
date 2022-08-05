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

#include <iostream>
#include <vector>
using namespace std;

// Definition for a binary tree node.
struct TreeNode {
    int val;
    TreeNode *left;
    TreeNode *right;
    TreeNode(int x) : val(x), left(NULL), right(NULL) {}
};

// Backtracking Approach

class Solution {
public:
    vector<TreeNode*> generateTrees(int n) {

        vector<int> vals;
        for(int i = 1; i <= n; i ++)
            vals.push_back(i);
        return generateTrees(vals);
    }

private:
    vector<TreeNode*> generateTrees(const vector<int>& vec){

        if(vec.size() == 0)
            return {};

        if(vec.size() == 1)
            return {new TreeNode(vec[0])};

        vector<TreeNode*> ret;
        for(int i = 0; i < vec.size(); i ++){
            vector<TreeNode*> left = generateTrees(vector<int>(vec.begin(), vec.begin() + i));
            vector<TreeNode*> right = generateTrees(vector<int>(vec.begin() + i + 1, vec.end()));
            if(left.empty()) left.push_back(NULL);
            if(right.empty()) right.push_back(NULL);

            for(TreeNode* ltree: left)
                for(TreeNode* rtree: right){
                    TreeNode* root = new TreeNode(vec[i]);
                    root->left = ltree;
                    root->right = rtree;
                    ret.push_back(root);
                }
        }
        return ret;
    }
};


int main() {

    cout << Solution().generateTrees(0).size() << endl;
    cout << Solution().generateTrees(3).size() << endl;

    return 0;
}

// Time Complexity: O(n^n)
// Space Complexity: O(n^n)

