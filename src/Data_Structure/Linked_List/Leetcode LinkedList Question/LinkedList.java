import java.util.*;

// Java program to reverse a linked list
// from position m to position n

class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	static Node reverse(Node node)
	{
		Node prev = null;
		Node current = node;
		
		while (current != null) {
			Node next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
	// function used to reverse a linked list from position m to n
static Node reverseBetween(Node head, int m, int n)
{
	if (m == n)
		return head;

	// revs and revend is start and end respectively of the
	// portion of the linked list which need to be reversed.
	// revs_prev is previous of starting position and
	// revend_next is next of end of list to be reversed.
	Node revs = null, revs_prev = null;
	Node revend = null, revend_next = null;

	// Find values of above pointers.
	int i = 1;
	Node curr = head;
	while (curr!=null && i <= n) {
		if (i < m)
			revs_prev = curr;
		if (i == m)
			revs = curr;
		if (i == n) {
			revend = curr;
			revend_next = curr.next;
		}
		curr = curr.next;
		i++;
	}
	revend.next = null;
	// Reverse linked list starting with revs.
	revend = reverse(revs);
	// If starting position was not head
	if (revs_prev!=null)
		revs_prev.next = revend;
	// If starting position was head
	else
		head = revend;
	revs.next = revend_next;
	return head;
}
	// prints content of double linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(10);
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		list.head.next.next.next.next = new Node(50);
		list.head.next.next.next.next.next = new Node(60);
		list.head.next.next.next.next.next.next = new Node(70);
		reverseBetween(head,3,6);
		list.printList(head);
		
	}
}

