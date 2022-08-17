/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with the heads of two singly linked-lists headA and headB.
4. We have to return the node at which the two lists intersect.
5. We have to return null if the two linked lists have no intersection at all.
6. We have to follow the inputs to the judge as given in the question.
7. Following this, the judge will then create the linked structure based on those inputs and pass the two heads, headA and headB to our program.
8. If we correctly return the intersected node, then our solution will be accepted.

*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

 package Striver_SDE_Sheet.Linked_List.IntersectionofTwoLinkedLists;

public class Intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode copyA = headA;
        ListNode copyB = headB;
        while (copyA != copyB) {
          copyA = copyA == null ? headB : copyA.next;
          copyB = copyB == null ? headA : copyB.next;
        }
        return copyA;
      }
}

// Time Complexity: O(m*n)
// Space Complexity: O(1)


