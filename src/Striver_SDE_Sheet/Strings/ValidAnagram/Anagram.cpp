/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with two strings s and t.
4. We have to just rearrange the letters of a different word or phrase.
5. We have to perform this using all the original letters exactly once.
6. Look at the given constraints Constraints: 1 <= s.length, t.length <= 5 * 104 && s and t consist of lowercase English letters.
7. Now return true if t is an anagram of s
8. Otherwise return false.

*/
/*
#include <iostream>
using namespace std;

// Sorting
class Solution {
public:
    bool isAnagram(string s, string t) {

        sort(s.begin(), s.end());
        sort(t.begin(), t.end());

        return s == t;
    }
};


int main() {

    cout << Solution().isAnagram("anagram", "nagaram") << endl;
    cout << Solution().isAnagram("rat", "car") << endl;
    cout << Solution().isAnagram("ab", "a") << endl;

    return 0;
}*/

// Time Complexity: O(nlogn)
// Space Complexity: O(1)
