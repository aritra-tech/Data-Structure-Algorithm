/*
    Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/
    Given unsorted array, return length of longest consecutive sequence
    Ex. nums = [100,4,200,1,3,2] -> 4, longest is [1,2,3,4]

    Time: O(n)
    Space: O(n)
*/

class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        unordered_set<int> s;
        for (int i = 0; i < nums.size(); i++) {
            s.insert(nums[i]);
        }
        
        int result = 0;
        
        for (auto it = s.begin(); it != s.end(); it++) {
            int currNum = *it;
            if (s.find(currNum - 1) != s.end()) {
                continue;
            }
            int currLength = 1;
            while (s.find(currNum + 1) != s.end()) {
                currLength++;
                currNum++;
            }
            result = max(result, currLength);
        }
        
        return result;
    }
};