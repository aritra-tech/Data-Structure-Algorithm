#include <bits/stdc++.h>
#include <iostream>
#include <vector>

using namespace std;

// Fibonacci Series

class Solution {

public:
    int climbStairs(int n) {

        assert(n > 0);

        if(n == 1)
            return 1;

        int prev = 1, cur = 1;
        for(int i = 3 ; i <= n + 1; i ++){
            int f = cur + prev;
            prev = cur;
            cur = f;
        }
        return cur;
    }
};

int main() {

    cout << Solution().climbStairs(10) << endl;
    return 0;
}

// Time Complexity: O(n)
// Space Complexity: O(1)
