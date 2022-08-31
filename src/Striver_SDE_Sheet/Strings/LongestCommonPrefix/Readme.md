## Problem Statement - 
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

### Link :- [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

### Approach-1

- First of all sort the given input string so it will sort the string according to which alphabets come first, it will not sort every particular string individually.

- Store first string of input in 'a' & last string of input in 'b'.

- Now as we know the string which 'a' will contain will be the smallest string in size, so if there is any common prefix in whole input then the prefix size can't be more than 'a' size & since 'b' is the last string that means the prefix will exist between 'a' & 'b'.

- Iterate till the 'a' size and check if a[i]==b[i] means if any character exist in a and that also exist in b it means it will exist in all the string's between a & b.

- If a[i]==b[i] then add a[i] in our ans otherwise if they are not equal then we will immediately break because we want common prefix.


### Code

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        int n=strs.size();
        string ans= "";
        sort(strs.begin(),strs.end());
        string a=strs[0];
        string b=strs[n-1];
        for(int i=0;i<a.size();i++)
        {
            if(a[i]==b[i])
            {
                ans+=a[i];
            }
            else
            {
                break;
            }
        }
        return ans;
    }
};


 ### Complexity
 - Time Complexity: O(n logn)
 - Space Complexity:O(n)


 ### Approach-2

- Create a string ans and store first string of input in that.

- Use a for loop to keep the counter until i hits strs.size().

- Now run a loop for j 0 -> ans.size() if ans[j] means the first character of string ans . Suppose ans= "flower" then ans[j] will be f.

- strs[i][j] means when i=1 & j=0 , that first string's (index=1) 0th character, if they are not equal then break.

- Otherwise j will store the index that ans has this much common prefix.


### Code

class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string ans= strs[0];
        for(int i=1;i<strs.size();i++)
        {
            int j;
            for( j=0;j<ans.size();j++)
            {
                if(ans[j]!=strs[i][j]) break;
            }
            
            ans=ans.substr(0,j);
            if(ans=="") {return ans;}
        }
        return ans;
    }
};


### Complexity
- Time Complexity:O(N)
 - Space Complexity: O(N)