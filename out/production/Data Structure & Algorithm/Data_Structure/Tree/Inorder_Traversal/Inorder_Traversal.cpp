#include <iostream>
#include <vector>

using namespace std;

struct Node
{
    int data;
    Node *left;
    Node *right;

    Node(int val = 0)
    {
        data = val;
        left = NULL;
        right = NULL;
    }
};

void inorder(Node *root, vector<int>& ans);

int main()
{
    vector<int> ans;

    // building a tree
    Node *root = new Node(1), *temp = root;
    root -> left = new Node(2); 
    root -> right = new Node(3); 

    temp = root -> left;
    temp -> left = new Node(4);
    temp -> right = new Node(5);

    temp = root -> right;
    temp -> left = new Node(6);
    temp -> right = new Node(7); // 1 2 3 4 5 6 7

    inorder(root, ans);

    for(int i : ans)
        cout << i << " "; // 4 2 5 1 6 3 7 

    return 0; 
}

// fills the ans vector with inorder traversal of tree
void inorder(Node *root, vector<int>& ans)
{
    if(root == NULL)
        return;

    inorder(root -> left, ans);
    ans.push_back(root -> data);
    inorder(root -> right, ans);
}
