class Solution {
public:
    int coinChange(vector<int>& coins, int n)
    {
        // Initialize the DynamicProg vector
        vector<int> DynamicProg(n+1, 1e9);
        DynamicProg[0] = 0;
        for(int i = 1 ; i<=n ; i++)
            {
            for(int j = 0 ; j<coins.size(); j++)
            {
                if(i>=coins[j])
                    DynamicProg[i] = min( DynamicProg[i], DynamicProg[i-coins[j]]);
            }
            DynamicProg[i]++;
        }
        if(DynamicProg[n]>=1e9)return -1; //no possibilities of finding amount
        else return DynamicProg[n];
    }
};
