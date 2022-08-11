/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with a positive integer n.
4. We split digit string into the minimal number of substrings.
5. Each substring contains exactly one unique digit.
6. Then for each substring, say the number of digits, then say the digit.
7. Finally, concatenate every said digit and return the nth term of the count-and-say sequence.

*/

#include <iostream>
using namespace std;

class Solution {
public:
    string countAndSay(int n) {

        string s = "1";
        if(n == 1)
            return s;

        for(int i = 2; i <= n; i ++)
            s = next(s);
        return s;
    }

private:
    string next(const string& s){

        string ret = "";
        int start = 0;
        for(int i = start + 1; i <= s.size(); i ++)
            if(i == s.size() || s[i] != s[start]){
                ret += to_string(i - start) + s[start];
                start = i;
            }
        return ret;
    }
};


int main() {

    cout << Solution().countAndSay(1) << endl;
    cout << Solution().countAndSay(2) << endl;
    cout << Solution().countAndSay(3) << endl;
    cout << Solution().countAndSay(4) << endl;
    cout << Solution().countAndSay(5) << endl;
    cout << Solution().countAndSay(30) << endl;

    return 0;
}

// Time Complexity: O(n * 2^n)
// Space Complexity: O(2^n)

