
## Problem Statement - 
Given a Linked List of size N, where every node represents a sub-linked-list and contains two pointers:

(i) a next pointer to the next node,

(ii) a bottom pointer to a linked list where this node is head.

Each of the sub-linked-list is in sorted order.

Flatten the Link List such that all the nodes appear in a single level while maintaining the sorted order. 
### Link :- [Flattening Linked List](https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1)




### Approach: 

### Using merging
   - Recursively call to merge the current linked list with the next linked list
- If the current linked list is empty or there is no next linked list then return the current linked list (Base Case)
- Start merging the linked lists, starting from the last linked list
- After merging the current linked list with the next linked list, return the head node of the current linked list
 

         class Solution
            {
        Node mergeTwoLists(Node a, Node b) {
        
        Node temp = new Node(0);
        Node res = temp; 
        
        while(a != null && b != null) {
            if(a.data < b.data) {
                temp.bottom = a; 
                temp = temp.bottom; 
                a = a.bottom; 
            }
            else {
                temp.bottom = b;
                temp = temp.bottom; 
                b = b.bottom; 
            }
        }
        
        if(a != null) temp.bottom = a; 
        else temp.bottom = b;
        return res.bottom; 
    
            }

          Node flatten(Node root)
        { 
	   
	
	       if (root == null || root.next == null) 
                return root; 
      
            // recur for list on right 
            root.next = flatten(root.next); 
      
            // now merge 
            root = mergeTwoLists(root, root.next); 
      
            // return the root 
            // it will be in turn merged with its left 
            return root; 
         }
         }

         ### Complexity
  - Time Complexity: O(N)

  - Space Complexity: O(1)