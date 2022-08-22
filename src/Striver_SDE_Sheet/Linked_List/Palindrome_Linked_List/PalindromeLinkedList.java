package Striver_SDE_Sheet.Linked_List.Palindrome_Linked_List;
import java.util.*;

public class PalindromeLinkedList {
    int value;
    listNode next;
    listNode(int x)
    {
        value = x;
        next = null;
    }
}
class palindrome_linked_list {
    public static void main(String args[])
    {
        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(2);
        head.next.next.next.next = new listNode(1);
        System.out.println((isPalindrome(head)) ? "true" : "false");
    }
    static listNode middleOfList(listNode head)
    {
        listNode slow = head , fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static listNode reverseList(listNode head)
    {
        listNode prev = null;
        while(head != null)
        {
            listNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    static boolean isPalindrome(listNode head)
    {
        if(head == null)
            return true;
        listNode middleNode = middleOfList(head);
        listNode startOfSecondHalf = reverseList(middleNode.next);
        listNode ptr1 = head , ptr2 = startOfSecondHalf;
        while(ptr2 != null)
        {
            if(ptr1.value != ptr2.value)
                return false;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return true;
    }
}