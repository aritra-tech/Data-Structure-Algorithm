## Problem Statement - 
Given an array of N integers, write a program to return an element that occurs more than N/2 times in the given array. You may consider that such an element always exists in the array.

### Link :- [Majority Element](https://leetcode.com/problems/majority-element/)

### Approach
#### Brute Force

Check the count of occurrences of all elements of the array one by one. Start from the first element of the array and count the number of times it occurs in the array. If the count is greater than the floor of N/2 then return that element as the answer. If not, proceed with the next element in the array and repeat the process.

- Time Complexity: O(N*N) 

- Space Complexity: O(1)

### Using Hashmap
In Hashtable(key-value pair), at value, maintain a count for each element(key), and whenever the count is greater than half of the array length, return that key(majority element). 
 #### Approach

 Follow the steps below to solve the given problem:

- Create a hashmap to store a key-value pair, i.e. element-frequency pair.
- Traverse the array from start to end.
- For every element in the array, insert the element in the hashmap if the element does not exist as a key, else fetch the value of the key ( array[i] ), and increase the value by 1
- If the count is greater than half then print the majority element and break.


 ### Complexity
  - Time Complexity: O(N)-> Frequency array or O(N log N) -> HashMap 

  - Space Complexity: O(N)

  ### Optimal Approach  

  ## Moore’s Voting Algorithm
  - Initialize 2 variables: 
   - Count –  for tracking the count of element
  - Element – for which element we are counting
- Traverse through nums array.
- If Count is 0 then initialize the current traversing integer of array as Element 
- If the traversing integer of array and Element are same increase Count by 1
- If they are different decrease Count by 1
- The integer present in Element is the result w

### Complexity
  - Time Complexity: O(N)

 - Space Complexity: O(1)