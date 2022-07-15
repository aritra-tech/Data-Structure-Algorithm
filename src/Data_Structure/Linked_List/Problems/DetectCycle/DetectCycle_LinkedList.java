package Data_Structure.Linked_List.Problems.DetectCycle;

public class DetectCycle_LinkedList {
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
        head.next.next.next.next = head.next; //Cycle (Comment this to remove cycle)

        detectCycle(head);
    }

    private static void detectCycle(ListNode head) {
        if (head == null) return;
        ListNode slow = head;
        ListNode fast = head;
        boolean detected = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                System.out.println("Linked List Loop Detected!");
                detected = true;
                break;
            }
        }
        if (detected) {
            fast = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            System.out.println(slow.val + " is the Node where loop begins!");
            return;
        }
        System.out.println("No Loop detected!");
    }
}
