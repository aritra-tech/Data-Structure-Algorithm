#include<bits/stdc++.h>
using namespace std;

class Solution
{
public:
    bool CheckCycle(int node,int parent,vector<int>& visited,vector<int>adj[]) {
        visited[node] = 1;
        for (auto it: adj[node]) {
            if (!visited[it]) {
                if (CheckCycle(it, node, visited, adj)) {
                    return true;
                }
            } else if (it != parent) {
                return true;
            }
            return false;
        }
    }
        bool isCycle(int v,vector<int>adj[])
        {
            vector<int>visited(v+1,0);
            for(int i=0;i<v;++i)
            {
                if(!visited[i])
                {
                    if(CheckCycle(i,-1,visited,adj)){return true;}
                }
            }
            return false;
        }
};

int main()
{
    int v=5;
    int e=5;

    vector<int>adj[v];

    adj[0].push_back(1);
    adj[1].push_back(0);


    adj[1].push_back(2);
    adj[2].push_back(1);


    adj[1].push_back(4);
    adj[4].push_back(1);


    adj[4].push_back(3);
    adj[3].push_back(4);


    adj[2].push_back(3);
    adj[3].push_back(2);

    Solution obj;
    bool answer=obj.isCycle(v,adj);

    if(answer)
    {
        cout<<"Cycle Detected...!!"<<"\n";
    }
    else
    {
        cout<<"No Cycle Detected...!!"<<"\n";
    }

}