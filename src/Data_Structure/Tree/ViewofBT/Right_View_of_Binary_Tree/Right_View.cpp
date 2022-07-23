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

void rightView(Node *root, int level, vector<int>& ans);

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

    temp = temp -> left;
    temp -> left = new Node(8);
    // 1 2 3 4 5 6 7 N N N N 8 N N N (N denotes NULL)

    rightView(root, 0, ans);

    for(int i : ans)
        cout << i << " "; // 1 3 7 8

    return 0; 
}

// fills the ans vector with right view of tree
void rightView(Node *root, int level, vector<int>& ans)
{
    if(root == NULL)
        return;
        
    if(level == ans.size())
        ans.push_back(root -> data);    
        
    rightView(root -> right, level + 1, ans);
    rightView(root -> left, level + 1, ans);
}
