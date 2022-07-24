#include <bits/stdc++.h>
using namespace std;

// Binary Tree Node
struct TreeNode {
	int val;
	struct TreeNode *left, *right;
};
// function to create a new node
TreeNode* newNode(int val)
{
	TreeNode* temp = new TreeNode;
	temp->val = val;
	temp->left = temp->right = NULL;
	return (temp);
}
int distributeCoinsUtil(TreeNode* root, int& ans)
{
	// Base Case
	if (root == NULL)
		return 0;
	// Traverse left subtree
	int l = distributeCoinsUtil(root->left, ans);
	// Traverse right subtree
	int r = distributeCoinsUtil(root->right, ans);
	// Update number of moves
	ans += abs(l) + abs(r);
	// Return number of moves to balance current node
	return root->val + l + r - 1;
}
// Function to find the number of moves to distribute all of the coins
int distributeCoins(TreeNode* root)
{
	int ans = 0;
	distributeCoinsUtil(root, ans);
	return ans;
}
int main()
{
	TreeNode* root = newNode(3);
	root->left = newNode(0);
	root->right = newNode(0);
	cout << distributeCoins(root);
	return 0;
}
