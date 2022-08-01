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
 
vector<vector<int>> verticalTraversal(Node* root) {
    map<int,vector<int>> m; // When iterate map, key is already the order of x-axis
    queue<pair<int,Node*>> q; // For level traversal
    q.push({0,root}); // Root default x-axis is 0
    while(!q.empty()){
        multiset<pair<int,int>> temp; // Using multiset to handle duplicate values
        int n=q.size();
        for(int i=0;i<n;i++){   
            auto p=q.front();
            q.pop();
            temp.insert({p.first,p.second->data});
            if (p.second->left) {
                q.push({p.first-1,p.second->left});                                
            }
            if (p.second->right) {
                q.push({p.first+1,p.second->right});
            }
        }
        for(auto p:temp) m[p.first].push_back(p.second); // push elements of same vertical order into map
    }
    vector<vector<int>> res;
    for(auto [f,s]:m) res.push_back(s); // Converting map into a vector
    return res;
}


