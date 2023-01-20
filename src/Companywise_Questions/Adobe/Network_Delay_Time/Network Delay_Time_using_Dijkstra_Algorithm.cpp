/*
    Problem Link: https://leetcode.com/problems/network-delay-time/
    
    Time: 287 ms (Beats 29.71%), Space: 43.5 MB (Beats 44.24%)  --  Leetcode
*/

class Solution {
public:
    int networkDelayTime(vector<vector<int>>& times, int n, int k) {

        vector<pair<int,int>> adj[n+1]; // 1 based indexing
        // make adjacency list
        for(auto it: times){
            adj[it[0]].push_back({it[1], it[2]});
        }

        priority_queue<pair<int,int>, vector<pair<int,int>>, greater<pair<int,int>>> pq;  // using priority queue | Structure:  {dist, node}
        pq.push({0, k});  // push initial  

        vector<int> dist(n+1, 1e9);
        dist[k]= 0;     // initialize 0 as min distance to K itself

        while(!pq.empty()){     // while pq is not empty
            int dis= pq.top().first;    // to get the first element of the priority queue
            int node= pq.top().second;  // to get the second element of the priority queue
            pq.pop();                   // remove the item from priority queue since we have stored the useful values

            for(auto it: adj[node]){    // traversing using adjacency list
                int adjNode= it.first;  
                int wt= it.second;
                
                if(wt + dis < dist[adjNode]){     // concept of dijkstra algorithm
                    dist[adjNode]= dis + wt;
                    pq.push({dis + wt, adjNode});
                }
            }
        }

        int ans = *max_element(dist.begin() + 1, dist.end());   // start from 1 since it is 1 based indexing (as per question)
        if(ans == 1e9)  return -1;

        return ans;
    }
};
