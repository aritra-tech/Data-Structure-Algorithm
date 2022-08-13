/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with the head of a linked list.
4. We have to look that there is a cycle in a linked list if there is some node in the list.
5. The cycle can be reached again by continuously following the next pointer.
6. Put the condition that if head == null and head->next == null then return null.
7. The pos is used to denote the index of the node that tail's next pointer is connected to which is 0-indexed.
8. If there is no cycle then it is -1.
9. Finally if there is no cycle, return null.

*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

package Striver_SDE_Sheet.Linked_List.LinkedListCycleII;

public class LLCycleII {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
          slow = slow.next;
          fast = fast.next.next;
          if (slow == fast) {
            break;
          }
        }
        if (fast == null || fast.next == null) {
          return null;
        }
        slow = head;
        while (slow != fast) {
          slow = slow.next;
          fast = fast.next;
        }
        return slow;
      }
}

// Time Complexity: O(N)
// Space Complexity: O(N)