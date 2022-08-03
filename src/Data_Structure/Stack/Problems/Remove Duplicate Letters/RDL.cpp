#include <bits/stdc++.h>
#include <iostream>
#include <stack>

using namespace std;

class Solution {
public:
    string removeDuplicateLetters(string s) {
        const int ASCII_LEN = 256;
        int counter[ASCII_LEN] = {0};
        bool visited[ASCII_LEN] = {false};
        
        for (char ch : s) {
            counter[ch]++;
        }
        
        string result;
        for (char ch : s) {
            counter[ch]--;
            // if the current `ch` has already put into the result.
            if (visited[ch]) continue;
            
            // if the current `ch` is smaller than the last one char in result.
            // and we still have duplicated last-one char behind, so we can remove the current one.
            while ( !result.empty() && ch < result.back() && counter[result.back()] ) {
                visited[result.back()] = false;
                result.pop_back();
            }
            result.push_back(ch);
            visited[ch] = true;
        }
        return result;
    }
};