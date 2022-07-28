package Data_Structure.Linked_List.Problems.Middle_Of_Linked_List;


public class middle {

    static class ListNode {
        int val;
        ListNode next;
        ListNode (int data) {
            this.val = data;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);


        System.out.println(middleNode(head));
    }

    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}