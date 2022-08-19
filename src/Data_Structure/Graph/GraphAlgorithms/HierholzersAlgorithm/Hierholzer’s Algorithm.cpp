/*
Advantage:

Algorithm:
The algorithm assumes that the given graph has a Eulerian Circuit.
Choose any starting vertex v, and follow a trail of edges from that vertex until returning to v.
 It is not possible to get stuck at any vertex other than v, because indegree and outdegree of 
 every vertex must be same, when the trail enters another vertex w there must be an unused edge
  leaving w. The tour formed in this way is a closed tour, but may not cover all the vertices and
   edges of the initial graph.
As long as there exists a vertex u that belongs to the current tour, but that has adjacent edges
 not part of the tour, start another trail from u, following unused edges until returning to u, 
 and join the tour formed in this way to the previous tour.
Thus the idea is to keep following unused edges and removing them until we get stuck. Once we get
 stuck, we backtrack to the nearest vertex in our current path that has unused edges, and we repeat
  the process until all the edges have been used. We can use another container to maintain the final path. 
Using Hierholzer’s Algorithm, we can find the circuit/path in O(E), i.e., linear time.
*/
#include <bits/stdc++.h>
using namespace std;

void printCircuit(vector< vector<int> > adj)
{
	// adj represents the adjacency list of
	// the directed graph
	// edge_count represents the number of edges
	// emerging from a vertex
	unordered_map<int,int> edge_count;

	for (int i=0; i<adj.size(); i++)
	{
		//find the count of edges to keep track
		//of unused edges
		edge_count[i] = adj[i].size();
	}

	if (!adj.size())
		return; //empty graph

	// Maintain a stack to keep vertices
	stack<int> curr_path;

	// vector to store final circuit
	vector<int> circuit;

	// start from any vertex
	curr_path.push(0);
	int curr_v = 0; // Current vertex

	while (!curr_path.empty())
	{
		// If there's remaining edge
		if (edge_count[curr_v])
		{
			// Push the vertex
			curr_path.push(curr_v);

			// Find the next vertex using an edge
			int next_v = adj[curr_v].back();

			// and remove that edge
			edge_count[curr_v]--;
			adj[curr_v].pop_back();

			// Move to next vertex
			curr_v = next_v;
		}

		// back-track to find remaining circuit
		else
		{
			circuit.push_back(curr_v);

			// Back-tracking
			curr_v = curr_path.top();
			curr_path.pop();
		}
	}

	// we've got the circuit, now print it in reverse
	for (int i=circuit.size()-1; i>=0; i--)
	{
		cout << circuit[i];
		if (i)
		cout<<" -> ";
	}
}


int main()
{
	vector< vector<int> > adj1, adj2;

	// Input Graph 1
	adj1.resize(3);

	// Build the edges
	adj1[0].push_back(1);
	adj1[1].push_back(2);
	adj1[2].push_back(0);
	printCircuit(adj1);
	cout << endl;

	// Input Graph 2
	adj2.resize(7);
	adj2[0].push_back(1);
	adj2[0].push_back(6);
	adj2[1].push_back(2);
	adj2[2].push_back(0);
	adj2[2].push_back(3);
	adj2[3].push_back(4);
	adj2[4].push_back(2);
	adj2[4].push_back(5);
	adj2[5].push_back(0);
	adj2[6].push_back(4);
	printCircuit(adj2);

	return 0;
}