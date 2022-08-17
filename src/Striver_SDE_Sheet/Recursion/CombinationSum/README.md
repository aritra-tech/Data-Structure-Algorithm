## Problem:
[Combination Sum](https://leetcode.com/problems/combination-sum/)

## Approach:
* Initially, the index will be 0, target as given and the data structure(list) will be empty

* Now there are 2 options viz to pick or not pick the current index element.

* If you pick the element, again come back at the same index as multiple occurrences of the same element is possible so the target reduces to target – arr[index] (where target -arr[index]>=0)and also insert the current element into the data structure.

* If you decide not to pick the current element, move on to the next index and the target value stays as it is. Also, the current element is not inserted into the data structure.

* While backtracking makes sure to pop the last element as shown in the recursion tree below.

* Keep on repeating this process while index < size of the array for a particular recursion call.

* You can also stop the recursion when the target value is 0, but here a generalized version without adding too many conditions is considered.

* Using this approach, we can get all the combinations.

## Complexity; 
- **Time Complexity**: O(2^t * n) **where t is the target, n is the average length**
- **Space Complexity**: O(n*x), **n is the average length and x is the no. of combinations**