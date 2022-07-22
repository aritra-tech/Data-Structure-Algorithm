package Algorithm.Recursion.Leetcode_Problems.Add_Two_Numbers;

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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode dummy = new ListNode(0);
      ListNode curr = dummy;
      int carry = 0;
  
      while (l1 != null || l2 != null || carry > 0) {
        if (l1 != null) {
          carry += l1.val;
          l1 = l1.next;
        }
        if (l2 != null) {
          carry += l2.val;
          l2 = l2.next;
        }
        curr.next = new ListNode(carry % 10);
        carry /= 10;
        curr = curr.next;
      }
  
      return dummy.next;
    }
  }