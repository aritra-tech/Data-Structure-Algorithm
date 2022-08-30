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

package Algorithm.Recursion.Leetcode_Problems.Add_Two_Numbers;

import java.util.*;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;

        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                current.next = new ListNode((l1.val + l2.val + carry) % 10);
                carry = (l1.val + l2.val + carry) / 10;
                l1 = l1.next;
                l2 = l2.next;
            } else if (l1 != null) {
                current.next = new ListNode((l1.val + carry) % 10);
                carry = (l1.val + carry) / 10;
                l1 = l1.next;
            } else {
                current.next = new ListNode((l2.val + carry) % 10);
                carry = (l2.val + carry) / 10;
                l2 = l2.next;
            }

            current = current.next;
        }

        if (carry != 0) {
            current.next = new ListNode(carry);
        }

        return result.next;
    }
}

// Time Complexity: O(n)
// Space Complexity: O(1)