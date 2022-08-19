# Problem Link
  [Remove the nth node from End list](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)

### Brute force Approach
Lets  K be the total nodes in the linked list.

- Observation :The Nth node from the end is (K-N+1)th node from the beginning.

- So the problem simplifies down to that we have to find  (K-N+1)th node from the beginning.

- One way of doing it is to find the length (K) of the linked list in one pass and then in the second pass move (K-N+1) step from the beginning to reach the Nth node from the end.

- To do it in one pass. Let’s take the first pointer and move N step from the beginning. Now the first pointer is (K-N+1) steps away from the last node, which is the same number of steps the second pointer require to move from the beginning to reach the Nth node from the end.

### Approach
- Take two pointers; the first will point to the head of the linked list and the second will point to the Nth node from the beginning.

- Now keep incrementing both the pointers by one at the same time until the second is pointing to the last node of the linked list.

- After the operations from the previous step, the first pointer should point to the Nth node from the end now. So, delete the node the first pointer is pointing to.

### Time Complexity 
- Time complexity: O(n)
- Space complexity: O(1)