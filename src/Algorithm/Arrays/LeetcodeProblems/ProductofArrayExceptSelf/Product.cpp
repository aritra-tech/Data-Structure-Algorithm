#include <bits/stdc++.h>
#include <iostream>
using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        
        int len = nums.size();
        vector<int> result(len, 1);
        
        //from the left to right 
        for (int i=1; i<len; i++) {
            result[i] = result[i-1]*nums[i-1];
        }
        //from the right to left
        int factorial = 1;
        for (int i=len-2; i>=0; i--){
            factorial *= nums[i+1];
            result[i] *= factorial;
        }
        return result;
    }
};

// Time Complexity: O(n)
// Space Complexity: O(n)