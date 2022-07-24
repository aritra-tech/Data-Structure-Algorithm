class Solution {
  public:
    vector <int> bottomView(Node *root) {
        queue<pair<int,Node*>>q;
        map<int,int>mp;
        vector<int>ans;
        if(!root)return ans;
        q.push({0,root});
        while(!q.empty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                Node* temp=q.front().second;
                int level=q.front().first;
                q.pop();
                mp[level]=temp->data;
                if(temp->left) q.push({level-1,temp->left});
                if(temp->right)q.push({level+1,temp->right});
            }
        }
        for(auto it:mp)
        {
            ans.push_back(it.second);
        }
        return ans;
    }
};