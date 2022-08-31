## Problem Link:
[Next Greater Element](https://leetcode.com/problems/next-greater-element-i/)

## Problem Statement
The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.

- You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
- For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2. If there is no next greater element, then the answer for this query is -1.

Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
 

## Approach:

## Brute Force:
1. We know that nums1 is a subset of num2, we will try to store all the indices at which elements of nums1 appear in nums2 in an array arr.
2. After this, we can pick the element appearing at these indices in nums2(lets say ith index) and traverse from (i+1)th index till last of nums2 and as soon we find any element > element at ith index, we add it to our array answer and break and continue from the next index.
3. If we do not find any such element, we will simply append -1 to our answer.

### Python Code
```
class Solution:
    def nextGreaterElement(self, nums1: List[int], nums2: List[int]) -> List[int]:
        
        #nums1 is a subset of nums2
        n2 = len(nums2)
        arr = []
        answer = []
        for i in nums1:
            for j in range(0, n2):
                if i == nums2[j]:
                    arr.append(j)
        
        #arr contains j values : 2, 0 , 3, which is the index at which elements of nums1 are present in nums2
        #now, traverse from (j+1) till n2 and check, as soon as any element is > than this, break
        for i in arr:
            for j in range(i+1, n2):
                if nums2[j] > nums2[i]:
                    answer.append(nums2[j])
                    break
            else:
                answer.append(-1)
        return answer
```

### Time Complexity: O(n^2)
### Space Complexity: O(n)


## Optimal Solution:

1. We iterate through nums2[] and push each element into a stack.
2. If the current element in the iteration is greater than the top most element in the stack, then we pop it out and add the popped out element as key and the current element as the value (next greater number).
3. We repeat this process as long as the current element is greater than the top most element in the stack or the stack is empty.
4. The current element is also added to the stack.
5. The last element in the nums2[] will not have a next element. Hence we are not adding that to the map.
6. Similarly if there are elements in the stack which does not have a next greater element, remains in the stack and is not moved to the map as the requirement for these elements is to default it to -1, which is being taken care while fetching values from the map.


### C++ Code:

```cpp

class Solution {
public:
    vector<int> nextGreaterElement(vector<int>& nums1, vector<int>& nums2) {
        vector<int> res(nums1.size(), -1);
        stack<int> st;
        unordered_map<int, int> umap;
        for(int i=0; i<nums2.size(); i++) {
            int element = nums2[i];
            while(!st.empty() && element > st.top())
            {	
                umap[st.top()] = element;
                st.pop();
            }   
            st.push(element);
        }
        for(int i=0; i<nums1.size(); i++) {
            int ele = nums1[i];
            if(umap.find(ele) != umap.end())
            {
                int nge = umap[ele];
                res[i] = nge; 
            }       
        }
        return res;
    }
};

```

### Time Complexity: O(n*log(n))
### Space Complexity: O(n)

