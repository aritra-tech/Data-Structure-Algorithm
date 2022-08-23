package Striver_SDE_Sheet.Linked_List.PalindromeOfLinkedList;
import java.util.*;

class Node {
        int num;
        Node next;
        Node(int val) {
            num = val;
            next = null;
        }
}
class palindrome{
static Node insertNode(Node head,int val) {
    Node newNode = new Node(val);
    if(head == null) {
        head = newNode;
        return head;
    }
    
    Node temp = head;
    while(temp.next != null) temp = temp.next;
    
    temp.next = newNode;
    return head;
}

static Node reverse(Node ptr) {
    Node pre=null;
    Node nex=null;
    while(ptr!=null) {
        nex = ptr.next;
        ptr.next = pre;
        pre=ptr;
        ptr=nex;
    }
    return pre;
}
 // solution 
static boolean isPalindrome(Node head) {
    if(head==null||head.next==null) return true;
        
    Node slow = head;               // slow pointer = x
    Node fast = head;               // fast pointer = 2x
        
    while(fast.next!=null&&fast.next.next!=null) { //middle of linkedlist
        slow = slow.next; 
        fast = fast.next.next;
    }
        
    slow.next = reverse(slow.next);        //reverse the halves
    slow = slow.next;
    Node temp = head;
        
    while(slow!=null) {                       // comparing 
        if(temp.num != slow.num) return false;
      temp= temp.next;
        slow = slow.next;
    }
    return true;
}

public static void main(String args[]) {
    Node head = null;
    head=insertNode(head,1);
    head=insertNode(head,2);
    head=insertNode(head,3);
    head=insertNode(head,2);
    head=insertNode(head,1);
    if(isPalindrome(head)==true)
    System.out.println("True"); 
    else
    System.out.println("False");
    
}
}