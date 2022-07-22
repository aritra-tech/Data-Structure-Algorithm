//Using BFS Traversal
    int deepestLeavesSum(TreeNode* root) {
        queue<TreeNode*> q;
        q.push(root);
        int sum = 0;
        while(!q.empty())
        {   // breadth = number of nodes at the current level
            int breadth = q.size();
            sum = 0;
            for(int i = 0; i<breadth; i++)
            {
                TreeNode* front = q.front(); q.pop();
                //at each level update the sum
                sum += front->val;
                if(front->left) q.push(front->left);
                if(front->right) q.push(front->right);
            }
        }
        return sum;
    }

//DFS Traversal
		int depth = 0, sum = 0;
    int deepestLeavesSum(TreeNode* root, int curr_depth = 0) {

        if(!root) return 0;
        // if current root is a left
        if(!root->left && !root->right)
            // if current depth is the deepest them add current root value to sum
            if(curr_depth == depth) sum += root->val;
            // if found more deeper node then update the sum
            else if(curr_depth > depth){ sum = root->val; depth = curr_depth;}

        deepestLeavesSum(root->left, curr_depth + 1);
        deepestLeavesSum(root->right, curr_depth + 1);
        return sum;
}
