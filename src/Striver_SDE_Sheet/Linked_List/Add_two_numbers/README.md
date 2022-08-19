# Problem Link
[Add two numbers](https://leetcode.com/problems/add-two-numbers/)

### Brute force Approach
- Traverse both lists to the end and add preceding zeros in the list with lesser digits. Then call a recursive function on the start nodes of both lists which calls itself for the next nodes of both lists till it gets to the end. This function creates a node for the sum of the current digits and returns the carry. 

### Approach
- Traverse the two linked lists in order to add preceding zeros in case a list is having lesser digits than the other one.
- Start from the head node of both lists and call a recursive function for the next nodes.
- Continue it till the end of the lists.
- Creates a node for current digits sum and returns the carry.
### Time Complexity 
- Time Complexity: O(m + n), where m and n are numbers of nodes in first and second lists respectively.
  The lists need to be traversed only once.
- Space Complexity: O(m + n).
  A temporary linked list is needed to store the output number  