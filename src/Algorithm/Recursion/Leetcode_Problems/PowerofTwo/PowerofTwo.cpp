#include <bits/stdc++.h>
#include <iostream>
using namespace std;

class Solution {
public:
    bool isPowerOfTwo(int n) {
        //negative number has a factor -1, 
        //so it's not a power of two
        if(n <= 0) return false;
        while(n > 0){
            //if there is a 1-bit in n,
            //then it should be the first bit
            //ex: 16 = 1000, 1 = 1, 17 = 1001
            if(n & 1 == 1 && n != 1) return false;
            n >>= 1;
        }
        return true;
    }
};

// Time Complexity: O(logn)
// Space Complexity: O(1)