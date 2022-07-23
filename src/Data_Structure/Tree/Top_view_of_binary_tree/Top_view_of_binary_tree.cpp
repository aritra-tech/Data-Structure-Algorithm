class Solution
{
    public:
    vector<int> topView(Node *root)
    {
        queue<pair<int,Node*>>q;
        vector<int>ans;
        map<int,int>mp;
        if(!root) return ans;
        q.push({0,root});
        while(!q.empty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int level=q.front().first;
                Node* temp=q.front().second;
                q.pop();
                
                if(mp.find(level)==mp.end()) mp[level]=temp->data;
                if(temp->left) q.push({level-1,temp->left});
                if(temp->right) q.push({level+1,temp->right});
            }
        }
        for(auto it:mp)
        {
            ans.push_back(it.second);
        }
        return ans;
    }

};