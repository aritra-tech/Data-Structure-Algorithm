#include <iostream>
using namespace std;

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {

        //sort the array of string as the first element and the last element

        int len=strs.size();
        sort(strs.begin(),strs.end());
        string a=strs[0];
        string b=strs[len-1];
        string result="";

        //now all we gotta do is compare

        for(int i=0;i<a.size();i++){
            if(a[i]!=b[i])
                break;
            else
                result=result+a[i];
        }
        return result;
    }
};
