#include <iostream>
#include <vector>
using namespace std;

// In this, every rise price can be a part of profit

class Solution {
public:
    int maxProfit(vector<int>& prices) {

        int res = 0;
        for(int i = 1 ; i < prices.size() ; i ++)
            if(prices[i] > prices[i-1])
                res += (prices[i] - prices[i-1]);

        return res;
    }
};

int main() {

    int prices1[] = {1, 2};
    vector<int> pricesVec1(prices1, prices1 + sizeof(prices1)/sizeof(int));
    cout << Solution().maxProfit(pricesVec1) << endl;

    return 0;
}

// Time Complexity: O(n)
// Space Complexity: O(1)

