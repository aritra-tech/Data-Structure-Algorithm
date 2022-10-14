package Striver_SDE_Sheet.Linked_List.Rotate_a_Linked_List;

import Striver_SDE_Sheet.Linked_List.ReverseofLinkedList.reverseofLL;

public class rotate {

    static class Node {
        int val;
        Node next;
        Node (int data) {
            this.val = data;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 2;


        System.out.println(rotateRight(head,k));
    }

    public static Node rotateRight(Node head, int n) {
        if (head==null||head.next==null) return head;
        Node dummy=new Node(0);
        dummy.next=head;
        Node fast=dummy,slow=dummy;

        int i;
        for (i=0;fast.next!=null;i++)//Get the total length
            fast=fast.next;

        for (int j=i-n%i;j>0;j--) //Get the i-n%i th node
            slow=slow.next;

        fast.next=dummy.next; //Do the rotation
        dummy.next=slow.next;
        slow.next=null;

        return dummy.next;
    }
}
