// Coded by Rakesh

#include<bits/stdc++.h>
using namespace std;

    set<int>white;
    set<int>gray;
    set<int>black;

    int flag=0;

    void edge(vector<int>adj[],int u,int v)
    {
        adj[u].push_back(v);
    }
    void detectCycle(int u,vector<int>adj[])
    {
        white.erase(u);
        gray.insert(u);

        for(int i=0;i<adj[u].size();++i)
        {
            if(white.find(adj[u][i])!=white.end())
            {
                detectCycle(adj[u][i],adj);
            }
            if(gray.find(adj[u][i])!=gray.end())
            {
                flag=1;
            }
        }
        black.insert(u);
        gray.erase(u);
    }


    int main()
    {
        vector<int>adj[5];

        edge(adj,0,2);
        edge(adj,0,1);
        edge(adj,1,3);
        edge(adj,2,0);
        edge(adj,3,3);
        edge(adj,2,3);
        edge(adj,2,4);
        edge(adj,3,1);
        edge(adj,4,2);

        for(int i=0;i<5;++i)
        {
            white.insert(i);
        }
        detectCycle(0,adj);

        if(flag==0)
        {cout<<"Graph does not contain cycle"<<"\n";}
        else
        {cout<<"Graph contain cycle"<<"\n";}
        return 0;
    }