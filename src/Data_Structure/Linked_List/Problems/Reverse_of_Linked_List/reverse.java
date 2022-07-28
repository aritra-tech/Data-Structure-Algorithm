 package Data_Structure.Linked_List.Problems.Reverse_of_Linked_List;


 public class reverse {
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

         System.out.println(reverseList(head));
     }

    public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}