package Data_Structure.Linked_List.Problems.MergeTwoLists;

public class MergeTwoLists {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
        }

        ListNode() {
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode();
        push(head1, 1);
        push(head1, 4);
        push(head1, 5);
        push(head1, 8);
        push(head1, 10);

        ListNode head2 = new ListNode();
        push(head2, 2);
        push(head2, 3);
        push(head2, 6);
        push(head2, 7);
        push(head2, 9);

        printNode(head1.next);  //because head1 is 0 and head.next has the values
        printNode(head2.next);  //Same for head2
        ListNode ans = mergeList(head1.next, head2.next);
        System.out.println("\nAfter Merging: ");
        printNode(ans);
    }

    private static void printNode(ListNode head) {
        if (head == null) return;
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("Null\n");
    }

    private static ListNode mergeList(ListNode head1, ListNode head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        if (head1.val < head2.val) {
            head1.next = mergeList(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeList(head2.next, head1);
            return head2;
        }
    }

    private static void push(ListNode head, int data) {
        if (head == null) return;
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(data);
    }


}
