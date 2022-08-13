/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with the head of a linked list.
4. Reverse the nodes of the list k at a time.
5. Here k is a positive integer and is less than or equal to the length of the linked list.
6. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
7. We have to or may not alter the values in the list's nodes.
8. Look that only nodes themselves may be changed.
9. Look at the constraints Constraints given:
   a. The number of nodes in the list is n.
   b. 1 <= k <= n <= 5000
   c. 0 <= Node.val <= 1000
10. Finally return the modified list.

*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

package Striver_SDE_Sheet.Linked_List.ReverseNodesInKGroup;
public class ReverseNodes {
          public ListNode reverseKGroup(ListNode head, int k) {
          if (head == null) {
            return null;
          }
          ListNode start = head;
          ListNode curr = head;
          ListNode prev = null;
          ListNode revHead = null;
          while (curr != null) {
            int count = 1;
            while (curr.next != null && count < k) {
              curr = curr.next;
              count++;
            }
            if (count == k) {
              ListNode next = curr.next;
              curr.next = null;
              if (revHead == null) {
                revHead = curr;
              }
              ListNode reverse = reverse(start);
              if (prev != null) {
                prev.next = reverse;
              }
              start.next = next;
              prev = start;
              start = next;
              curr = next;
            }
            else {
              curr = curr.next;
            }
          }
          return revHead == null ? head : revHead;
        } 
        
        private ListNode reverse(ListNode root) {
          ListNode curr = root;
          ListNode next = null;
          ListNode prev = null;
          while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
          }
          return prev;
        }
}

// Time Complexity: O(n)
// Space Complexity: O(k)


