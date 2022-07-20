package Data_Structure.Linked_List.Problems.OddEvenLinkedList;

public class OddEvenLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        ListNode (int data) {
            this.val = data;
        }
        ListNode () {}
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        for (int i=1; i<=10; i++) {
            push(head, i);
        }

        printNode(head.next);

        ListNode newHead = oddEven(head.next);

        printNode(newHead);
    }

    private static void printNode(ListNode head) {
        if (head == null) return;
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("null\n");
    }

    private static ListNode oddEven(ListNode head) {
        if (head == null) return head;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    private static void push(ListNode head, int i) {
        if (head == null)
            return;
        else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(i);
        }
    }
}
