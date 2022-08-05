## Problem link:
[Reverse of Linked List](https://leetcode.com/problems/reverse-linked-list/)

## Approach:
 - In this type of cse, we first take a dummy node that will be assigned to NULL.
 - Then we take a next pointer which will be initialized to head->next and in future iterations, next will again be set to head->next
 - Now coming to changes on the head node, as we have set the dummy node as NULL and next to head->next, we can now update the next pointer of the head to the dummy node.
 - Before moving to the next iteration dummy is set to head and then the head is set to the next node.
 - Now coming to the next iteration: We’ll follow a similar process to set next as head->next and update head->next = dummy, a dummy set to head, and head set to next
 - These iterations will keep going while the head of the original Linked List is not NULL, i.e. we’ll reach the end of the original Linked List and the Linked List has been reversed.

## Code Snippet:

```
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp=null;
        ListNode next;
        while(head!=null){
            next = head.next;
            head.next=temp;
            temp=head;
            head=next;
        }
        return temp;
    }
}
```
