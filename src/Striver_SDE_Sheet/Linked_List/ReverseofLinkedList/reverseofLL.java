package Striver_SDE_Sheet.Linked_List.ReverseofLinkedList;

public class reverseofLL {

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


        System.out.println(reverseList(head));
    }

    private static Node reverseList(Node head) {
        Node temp=null;
        Node next;
        while(head!=null){
            next = head.next;
            head.next=temp;
            temp=head;
            head=next;
        }
        return temp;
    }
}
