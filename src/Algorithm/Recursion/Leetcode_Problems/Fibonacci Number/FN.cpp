#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int fib(int N) {

        if(N <= 1) return N;

        int prev = 0, cur = 1;
        for (int i = 2; i <= N; i++) {
            int f = cur + prev;
            prev = cur;
            cur = f;
        }
        return cur;
    }
};


int main() {

    return 0;
}

// Time Complexity: O(n)
// Space Complexity: O(1)

