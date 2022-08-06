package Striver_SDE_Sheet.Linked_List.ReverseofLinkedList;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        
        while(list1 != null || list2 != null) {
            
            boolean takeList2Value = list1 == null;
            if(list2 != null && list1 != null && list2.val < list1.val) takeList2Value = true;
            
            if(takeList2Value) {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            } else { //If not list 2 then we must take list 1
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            }
            
        }
        
        return dummy.next;
    }
    }
    

