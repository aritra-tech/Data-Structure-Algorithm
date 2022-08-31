


## Problem Statement - 
Given the head of a singly linked list, return true if it is a palindrome.
### Link :- [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)




### Approach: 

### Brute Force - using stack 
 or any other data structure
- A simple solution is to use a stack of list nodes. This mainly involves three steps.
- Traverse the given list from head to tail and push every visited node to stack.
- Traverse the list again. For every visited node, pop a node from the stack and compare data of popped node with the currently visited node.
- If all nodes matched, then return true, else false.

 ### Complexity
  - Time Complexity: O(N)

  - Space Complexity: O(N)

  ### Optimal Approach  

  ## Slow and Fast Pointer Method
  
  Find Middle - > reverse the right halves - > compare 
  Using Two pointers : 
   
  - Find the middle element of the linked list. 
- Reverse linked list from next element of middle element. 
- Iterate through the new list until the middle element reaches the end of the list.
- Use a temp node to check if the same element exists in the linked list from the middle element.

     

 ### Complexity
  - Time Complexity:  O(N/2)+O(N/2)+O(N/2)

 - Space Complexity: O(1)