
class Solution {
static bool cmp(vector<int>a,vector<int>b){ 
    return a[1]<b[1];
}
public:
    int jobScheduling(vector<int>&s,vector<int>&e,vector<int>&p){
        int n=p.size();
        vector<vector<int>>v;
        for(int i=0;i<s.size();i++) v.push_back({s[i],e[i],p[i]}); //make a vector first is starting point ,second is ending point and third is its profit.
        sort(v.begin(),v.end(),cmp); //sort according to end time.
        int dp[n];dp[0]=v[0][2];
        for(int i=1;i<n;i++){
            int f=0;
            for(int j=i-1;j>=0;j--){
                if(v[i][0]>=v[j][1]){ //similar to LIS. if we find our starting point of current index is greater or equal than any of the ending point in it's left then our job done (overlapping condition).
                    f=dp[j];
                    break;
                }
            }
            dp[i]=max(dp[i-1],f+v[i][2]); //we take simply max .
        }
        return dp[n-1];
    }
};