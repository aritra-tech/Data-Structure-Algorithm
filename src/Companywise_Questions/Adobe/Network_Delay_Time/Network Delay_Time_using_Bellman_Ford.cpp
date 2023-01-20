/*
    Problem Link: https://leetcode.com/problems/network-delay-time/
    
    Time: 492 ms (Beats 9.98%), Space: 57.9 MB (Beats 8.89%)  --  Leetcode
*/

class Solution {
public:
    int networkDelayTime(vector<vector<int>>& times, int n, int k) {
        vector<int> dist(n+1, 1e9);     // initialize MAX value (1e9) as initial minimum distance from K to every point
        dist[k]= 0;     // initialize 0 as min distance to K itself
    
        for(int i=0; i<n-1; i++){
            bool check= 0;
            for(auto it: times){
                int u= it[0];
                int v= it[1];
                int wt= it[2];

                // already been visited so we should update the dist
                if( (dist[u] != 1e9) && (dist[u] + wt < dist[v]) ){ 
                    dist[v]= dist[u] + wt;
                    check= 1;
                }
            }
            if(!check)  break;
        }

        int ans = *max_element(dist.begin() + 1, dist.end());   // start from 1 since it is 1 based indexing
        if(ans == 1e9)  return -1;   

        return ans;
    }
};
