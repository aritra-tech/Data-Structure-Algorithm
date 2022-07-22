class Solution {
public:
    int findTheWinner(int n, int k) {
        // first initialize a queue and insert all the players.
        queue<int> q;
        for(int i=1; i<=n; i++) {
            q.push(i);}

        while(q.size()!=1) {
            int t = k;
            while(t>1) {
                int l = q.front();
                q.pop();
                q.push(l);
                t--;}
            q.pop();}

        return q.front();
    }};
