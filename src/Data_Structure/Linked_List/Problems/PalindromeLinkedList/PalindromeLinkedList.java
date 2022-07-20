package Data_Structure.Linked_List.Problems.PalindromeLinkedList;

import java.util.Stack;

public class PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
            this.next = null;
        }

        ListNode() {
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        for (int i = 1; i <= 5; i++) {
            push(head, i);
        }
        for (int i = 5; i > 0; i--) {
            push(head, i);
        }
        System.out.println(isPalindrome(head.next)); //Stack Method
        System.out.println(checkPalindrome(head.next)); //Reverse from Mid (Faster)
    }

    private static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (temp.val != stack.pop())
                return false;
            temp = temp.next;
        }
        return true;
    }

    private static boolean checkPalindrome(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }
        if (f != null) {
            s = s.next;
        }
        s = reverse(s);
        f = head;
        while (s != null) {
            if (f.val != s.val) {
                return false;
            }
            f = f.next;
            s = s.next;
        }
        return true;
    }

    private static ListNode reverse(ListNode head) {
        ListNode p = null;
        while (head != null) {
            ListNode n = head.next;
            head.next = p;
            p = head;
            head = n;
        }
        return p;
    }

    private static void push(ListNode head, int i) {
        if (head == null) return;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(i);
    }
}
