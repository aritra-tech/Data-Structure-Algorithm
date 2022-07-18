package Algorithm.Recursion.Swap_Nodes_In_Pairs;

public class SwapNodesInPairs {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int data) {
            this.val = data;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        printNode(head); //1->2->3->4->null

        ListNode newHead = swapNodes(head);

        printNode(newHead); //2->1->4->3->null
    }

    private static ListNode swapNodes(ListNode head) {
        ListNode temp = new ListNode(0); //Create a dummy node whose next is head
        temp.next = head;
        ListNode curr = temp; //Assign new Node to temp

        while (curr.next != null && curr.next.next != null) { //If curr'next or next to next is null, we stop
            ListNode first = curr.next;         //node before first is always curr
            ListNode second = curr.next.next;   //node after first is second
            first.next = second.next;           //We start swapping
            curr.next = second;
            curr.next.next = first;
            curr = curr.next.next;
        }
        return temp.next; //Return temp's next, which is our head
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
}
