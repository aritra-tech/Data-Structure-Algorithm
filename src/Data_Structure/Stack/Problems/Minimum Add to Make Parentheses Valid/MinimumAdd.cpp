#include <iostream>
#include <stack>

using namespace std;

class Solution {
public:
    int minAddToMakeValid(string S) {

        int res = 0, bal = 0;
        for(char c: S)
            if(c == '(')
                res ++, bal ++;
            else{
                if(bal)
                    res --, bal --;
                else
                    res ++, bal = 0;
            }
        return res;
    }
};


int main() {

    cout << Solution().minAddToMakeValid("()))((") << endl;

    return 0;
}

// Time Complexity: O(n)
// Space Complexity: O(1)
