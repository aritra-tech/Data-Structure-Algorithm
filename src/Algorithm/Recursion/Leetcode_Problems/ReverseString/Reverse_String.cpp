#include <iostream>
using namespace std;

class Solution {
public:
    string reverseString(string s) {

        int i = 0, j = s.size() - 1;
        while(i < j){
            swap(s[i], s[j]);
            i ++;
            j --;
        }

        return s;
    }
};


int main() {

    cout << Solution().reverseString("hello") << endl;

    return 0;
}

// Time Complexity: O(n)
// Space Complexity: O(1)
