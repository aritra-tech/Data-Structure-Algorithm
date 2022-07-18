#include<iostream>
#include<vector>
#include<queue>
using namespace std;
//This is for undirected graph
//For directed graph , remove the second condition
void addEdge(vector<int>* graph,int u,int v)
{
	graph[u].push_back(v);
	graph[v].push_back(u);   // (2) Undirected Graph
}
/*Driver Function*/
int main()
{
	int n; //vertices
	int e; //edges
	int v,u; //from-to 
	cout<<"Enter the Size of Vertices"<<endl;
	cin>>n;
	cout<<"Enter the Size of Edges"<<endl;
	cin>>e;
	int copy;
	copy=n; //for copying
	int a[n+1]={0}; //array for node visited or not
	vector<int> graph[n+1]; //for sorting the vertices
	for(int i=1;i<=e;i++)
	{
		cout<<"From ";
		cin>>u;
		cout<<"To ";
		cin>>v;
		addEdge(graph,u,v); //function for adding edge
	}
	vector<int>::iterator it; //iterator
	queue<int> q; //queue
	q.push(1); //initially store the first element in queue
	a[1] = 1; 
	int x;
	cout<<"BFS is"<<endl;
	while(!q.empty())
	{
		x = q.front();
		q.pop();
		cout<<x<<" ";
		for(it=graph[x].begin();it!=graph[x].end();it++)
		{
			if(a[*it]!=1)
			{
				q.push(*it);
				a[*it]=1;
			}
		}
	}
	return 0;
}