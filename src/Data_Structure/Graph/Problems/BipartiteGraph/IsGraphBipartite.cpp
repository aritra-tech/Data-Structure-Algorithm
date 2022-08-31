class Solution {
public:
    bool colorbfs(int node,vector<int>&color,vector<vector<int>>& graph)
    {
        queue<int>q;
        q.push(node);
        color[node]=1;
        while(!q.empty())
        {
            int value=q.front();
            q.pop();
            for(auto it:graph[value])
            {
                // if node not traversed then we'll move inside 
                if(color[it]==-1)
                {
                    color[it]=1-color[value];
                    q.push(it);
                }
                else
                {
                    if(color[it]==color[value]) return 0;
                }
            }
        }
        return 1;
    }
    bool isBipartite(vector<vector<int>>& graph) {
        int n=graph.size();
        // just like we make visited array here we will make color array & assign all values to -1
        vector<int>color(n+1,-1);
        for(int i=0;i<n;i++)
        {
            // if color[i] is -1 means it's not been traversed then we will go inside if
            if(color[i]==-1)
            {
                // if we get false from recursion then it means its not bipartite
                if(!colorbfs(i,color,graph))
                {
                    return 0;
                }
            }
        }
        
        return 1;
    }
};

/*
Time Complexity: O(V+E)
Space Complexity: O(V+E)
*/