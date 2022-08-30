
## Problem Statement - 
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 
### Link :- [Z Algorithm](https://leetcode.com/problems/implement-strstr/)




### Approach: 

### Z Algorithm
  Z algorithm is used to find the occurrence of a pattern in a string in linear time. Suppose if the length of the string is n and the size of the pattern to be searched is m, the time taken to solve will be of the order O(m+n).

The z-algorithm uses a Z array to find the occurrence of a pattern.

    class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    }
   ### Complexity
  - Time Complexity: O(N+m)

  - Space Complexity: O(1)