#include <bits/stdc++.h>
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

    TreeNode* func(vector<int>&nums,int s,int e){
        //base case
        if(s>=e)return NULL;

        //middle of the array is the root node
        int mid = s+(e-s)/2;
        TreeNode * root = new TreeNode(nums[mid]);

        //left part from middle is left subtree
        root->left = func(nums,s,middle);

        //right part of array is right subtree
        root->right = func(nums,middle+1,e);

        return root;
    }
    TreeNode* sortedArrayToBST(vector<int>& nums) {

        return func(nums,0,nums.size());
    }
};
