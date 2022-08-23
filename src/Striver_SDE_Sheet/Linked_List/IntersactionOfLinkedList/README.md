## Problem Statement - 
 Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
### Link :- [Intersaction of Linkedlist](https://leetcode.com/problems/intersection-of-two-linked-lists/)




### Approach: 

### Using Hashing
- Iterate through list 1 and hash its node address. Why? (Hint: depends on common attribute we are searching)
- Iterate through list 2 and search the hashed value in the hash table. If found, return node.
   ### Complexity
  - Time Complexity: O(N+M)

  - Space Complexity: O(N)

  ### Optimal Approach  

  ## Two- Pointer technique
  Using Two pointers : 

- Initialize two pointers ptr1 and ptr2  at head1 and  head2.
- Traverse through the lists, one node at a time.
- When ptr1 reaches the end of a list, then redirect it to head2.
- similarly, when ptr2 reaches the end of a list, redirect it to the head1.
- Once both of them go through reassigning, they will be equidistant from 
 the collision point
- If at any node ptr1 meets ptr2, then it is the intersection node.
- After the second iteration if there is no intersection node it returns NULL.   
   
      public class Solution {
      public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA==null) return null;
        if(headB==null) return null;
        ListNode ptr1= headA;
        ListNode ptr2= headB;
        
        while(ptr1!=ptr2){
         
            ptr1 = ptr1 == null ? headB : ptr1.next;
            ptr2 = ptr2 == null ? headA : ptr2.next;
        }
        return ptr1;
       }
      }

 ### Complexity
  - Time Complexity: O(N+M)

 - Space Complexity: O(1)