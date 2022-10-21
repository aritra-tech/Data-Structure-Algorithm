package Companywise_Questions.Apple.Add_Two_Numbers;

public class addtwonumbers {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        // linked list 1
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(4);
        list1.next.next = new ListNode(3);
        System.out.print("First Linked List is ");
        printList(list1);

        // linked list 2
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);
        System.out.print("Second Linked List is ");
        printList(list2);

        // resultant linked list
        ListNode result = addTwoNumbers(list1, list2);
        System.out.print("Resultant Linked List is ");
        printList(result);
    }
    private static ListNode reverseLinkedList(ListNode head) {
        ListNode previous = null, current = head, next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        return head;
    }
    // function to add two numbers
    private static ListNode addTwoNumbers(ListNode headList1, ListNode headList2) {

        if (headList1 == null)
            return headList2;

        if (headList2 == null)
            return headList1;


        ListNode result = null, head = null;
        int carry = 0;

        // reverse both the linked lists
        headList1 = reverseLinkedList(headList1);
        headList2 = reverseLinkedList(headList2);

        // while end of list is not reached
        while (headList1 != null || headList2 != null) {
            int sum = 0;
            // add value in linkedlist 1
            if (headList1 != null) {
                sum += headList1.val;
                headList1 = headList1.next;
            }
            // add value in linkedlist 2
            if (headList2 != null) {
                sum += headList2.val;
                headList2 = headList2.next;
            }
            // add carry
            sum += carry;

            int value = sum % 10;
            carry = sum / 10;
            // node with the remainder value
            ListNode node = new ListNode(value);
            if (result != null) {
                result.next = node;
                result = result.next;
            } else {
                result = head = node; // for the first iteration
            }
        }
        // if carry is present
        if (carry > 0) {
            result.next = new ListNode(carry);

        }

        head = reverseLinkedList(head);
        return head;
    }
    // function to print linked list
    private static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
