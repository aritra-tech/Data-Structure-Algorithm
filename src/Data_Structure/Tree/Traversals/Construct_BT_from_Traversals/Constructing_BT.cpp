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
    int curr = 0; // Locates the 0th index of preorder(root)
    vector<int> m_preorder,m_inorder;
    
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        m_preorder=preorder,m_inorder=inorder;
        return rec(0,preorder.size()-1);   // calling rec function starting from 0th index of inorder
    }
    TreeNode* rec(int l,int r) {
        if (l>r) return NULL;
        
        int i=0;
        while(m_inorder[i]!=m_preorder[curr]) {
            i++;
        }
        curr++;
        TreeNode* node=new TreeNode(m_inorder[i]);  // create a tree node with current element 
        node->left=rec(l,i-1);  // call the rec function for left node
        node->right=rec(i+1,r);  // call the rec function for right node
        return node;
        
    }
};