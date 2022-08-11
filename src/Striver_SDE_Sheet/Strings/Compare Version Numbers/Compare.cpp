/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given two version numbers, version1 and version2.
4. Compare those two version numbers.
5. We have to compare their revisions in left-to-right order to compare version numbers.
6. Revisions are compared using their integer value ignoring any leading zeros.
7. Using vector split the version numbers.
8. We mean that revisions 1 and 001 are considered equal.
9. Go upon the following conditions : If version1 < version2, return -1.
10. If version1 > version2, return 1.
11. Otherwise, return 0.

*/

#include <bits/stdc++.h>
#include <iostream>
using namespace std;

class Solution {
    public:
        vector<int> &split(const string &s, char delim, vector<int> &elems) {
            stringstream ss(s);
            string item;
            while (getline(ss, item, delim)) {
                elems.push_back(atoi(item.c_str()));
            }
            return elems;
        }


        vector<int> split(const string &s, char delim) {
            vector<int> elems;
            split(s, delim, elems);
            return elems;
        }

        void rightTrimZero(vector<int> &v){
            while (v.back() == 0){
                v.pop_back();
            }
        }

        int compareVersion(string version1, string version2) {

            //split the version by delimer '.'
            vector<int> ver1 = split(version1, '.');
            vector<int> ver2 = split(version2, '.');

            //remove the right Zeros
            rightTrimZero(ver1);
            rightTrimZero(ver2);

            //compare two versions 
            for (int i=0; i<ver1.size() && i < ver2.size(); i++) {
                if (ver1[i] < ver2[i]){
                    return -1;
                }else if(ver1[i] > ver2[i]){
                    return 1;
                }
            }

            //if the above for-loop is not returned, which means they are equal so far
            //then check the length.
            if (ver1.size() > ver2.size()) {
                return 1;
            }else if (ver1.size() < ver2.size()) {
                return -1;
            }

            return 0;

        }

};

// Time Conplexity : O(n)
// Space Complexity : O(1)

