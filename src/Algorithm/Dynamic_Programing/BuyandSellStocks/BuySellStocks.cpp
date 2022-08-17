#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& prices) {

        if(prices.size() == 0)
            return 0;

        int minPrice = prices[0];
        int res = 0;
        for(int i = 1 ; i < prices.size() ; i ++){
            res = max(res, prices[i] - minPrice);
            minPrice = min(minPrice, prices[i]);
        }

        return res;
    }
};

int main() {

    int prices1[] = {7, 1, 5, 3, 6, 4};
    vector<int> pricesVec1(prices1, prices1 + sizeof(prices1)/ sizeof(int));
    cout << Solution().maxProfit(pricesVec1) << endl;

    int prices2[] = {7, 6, 4, 3, 1};
    vector<int> pricesVec2(prices2, prices2 + sizeof(prices2)/ sizeof(int));
    cout << Solution().maxProfit(pricesVec2) << endl;

    return 0;
}

// Time Complexity: O(n)
// Space Complexity: O(1)


