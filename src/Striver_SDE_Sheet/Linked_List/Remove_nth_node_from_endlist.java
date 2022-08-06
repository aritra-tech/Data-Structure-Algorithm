import java.util.LinkedList;

public class Remove_nth_node_from_endlist {
    class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Function to insert node at the beginning of the list.
    public void push(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    // Function to print the nodes in the linked list.
    public void display()
    {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public void deleteNthNodeFromEnd(Node head, int n)
    {
        Node fast = head;
        Node slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return;
    }

    public static void main(String[] args)
    {
        Remove_nth_node_from_endlist l = new Remove_nth_node_from_endlist();

        // Create a list 1->2->3->4->5->NULL
        l.push(5);
        l.push(4);
        l.push(3);
        l.push(2);
        l.push(1);

        System.out.println(
                "***** Linked List Before deletion *****");
        l.display();

        System.out.println(
                "************** Delete nth Node from the End *****");
        l.deleteNthNodeFromEnd(l.head, 2);

        System.out.println(
                "*********** Linked List after Deletion *****");
        l.display();
    }
}
