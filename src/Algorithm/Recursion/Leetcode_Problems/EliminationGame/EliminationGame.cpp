#include <iostream>

using namespace std;

class Solution {
public:
    int lastRemaining(int n) {

        if(n == 1)
            return 1;

        return 2 * (1 + n/2 - lastRemaining(n/2));
    }
};

int main() {

    cout << Solution().lastRemaining(9) << endl;

    return 0;
}

// Time Complexity : O(logn)
// Space Complexity : O(logn)
