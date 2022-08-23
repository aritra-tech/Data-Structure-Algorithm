
## Problem Statement - 
 Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
### Link :- [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/)




### Approach: 

### Brute Force - using hash table
- Iterate the given list.
- For each node visited by the head pointer, check if the node is present in the hash table.
- If yes, the loop detected
- If not, insert the node in the hash table and move the head pointer ahead.
- If the head reaches null, then the given list does not have a cycle in it.
  ### Complexity
  - Time Complexity: O(N)

  - Space Complexity: O(N)

  ### Optimal Approach  

  ## Slow and Fast Pointer Method
  Using Two pointers : 

- slow moves 1 step at a time, fast moves 2 steps at a time.
- when slow and fast meet each other, they must be on the cycle
- x denotes the length of the linked list before starting the circle
- y denotes the distance from the start of the cycle to where slow and fast met
- C denotes the length of the cycle
- when they meet, slow traveled (x + y) steps while fast traveled 2 * (x + y) steps, and the extra distance (x + y) must be a multiple of the circle length C
- note that x, y, C are all lengths or the number of steps need to move.
- head, slow, fast are pointers.
- head moves x steps and arrives at the start of the cycle.
- so we have x + y = N * C, let slow continue to travel from y and after x more steps, slow will return to the start of the cycle.
- At the same time, according to the definition of x, head will also reach the start of the cycle after moving x steps.
- so if head and slow start to move at the same time, they will meet at the start of the cycle, that is the answer.

       public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        
        ListNode slow=head ;
        ListNode fast=head ;
        ListNode target= head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
             
           if(slow==fast)  break; //cycle detected
          }
          if(fast==null || fast.next==null) return null;
            while(slow!=target){
                target=target.next;
                slow=slow.next;
            } 
        
            return target;
        }
       
      }
    

 ### Complexity
  - Time Complexity: O(N)

 - Space Complexity: O(1)