# Problem Link

[MiddleOfLinkedList](https://leetcode.com/problems/middle-of-the-linked-list/)



### Brute force Approach
 
 We can traverse through the Linked List while maintaining a count of nodes let’s say in variable n, and then traversing for 2nd time for n/2 nodes to get to the middle of the list.
  
 

### Tortoise-Hare-Approach

It is the optimal approach in these we take two  pointer slow and fast where fast is 2 x slow.

### Approach

- Create two pointers slow and fast and initialize them to a head pointer.
- Move slow ptr by one step and simultaneously fast ptr by two steps until fast ptr is NULL or next of fast ptr is NULL.
- When the above condition is met, we can see that the slow ptr is pointing towards the middle of Linked List and hence we can return the slow pointer.

### Time Complexity 

-Time Complexity: O(N)

-Space Complexity: O(1)