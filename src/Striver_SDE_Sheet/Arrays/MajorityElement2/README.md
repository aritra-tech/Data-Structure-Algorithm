## Problem Statement - 
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

### Link :- [Majority Element 2](https://leetcode.com/problems/majority-element-ii/)


### Brute Force

### Approach: 
Simply count the no. of appearance for each element using nested loops and whenever you find the count of an element greater than N/3 times, that element will be your answer.

- Time Complexity: O(N^2) 

- Space Complexity: O(1)



### Using Hashmap
  Traverse the whole array and store the count of every element in a map. After that traverse through the map and whenever you find the count of an element greater than N/3 times, store that element in your answer.

 ### Complexity
  - Time Complexity: O(N)

  - Space Complexity: O(N)

  ### Optimal Approach  

  ## Moore’s Voting Algorithm
 - num1 and num2 will store our currently most frequent and second most frequent element.
- c1 and c2 will store their frequency relatively to other numbers.
- We are sure that there will be a max of 2 elements which occurs > N/3 times because there cannot be if you do a simple math addition.
Let, ele be the element present in the array at any index. 

- if ele == num1, so we increment c1.
- if ele == num2, so we increment c2.
- if c1 is 0, so we assign num1 = ele.
- if c2 is 0, so we assign num2 = ele.
- In all the other cases we decrease both c1 and c2.
In the last step, we will run a loop to check if num1 or nums2 are the majority elements or not by running a for loop check.
### Complexity
  - Time Complexity: O(N)

 - Space Complexity: O(1)