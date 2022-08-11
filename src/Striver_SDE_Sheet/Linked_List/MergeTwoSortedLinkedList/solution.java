package Striver_SDE_Sheet.Linked_List.ReverseofLinkedList;

import java.util.*;

/* Link list node */
class Node
{
	int data;
	Node next;
	Node(int d) {data = d;
				next = null;}
}
	
class MergeLists
{
Node head;

/* Method to insert a node at
the end of the linked list */
public void addToTheLast(Node node)
{
	if (head == null)
	{
		head = node;
	}
	else
	{
		Node temp = head;
		while (temp.next != null)
			temp = temp.next;
		temp.next = node;
	}
}

//display a linkedlist
void printList()
{
	Node temp = head;
	while (temp != null)
	{
		System.out.print(temp.data + " ");
		temp = temp.next;
	}
	System.out.println();
}


public static void main(String args[])
{
	
	MergeLists llist1 = new MergeLists();
	MergeLists llist2 = new MergeLists();
	
	// Node head1 = new Node();
	llist1.addToTheLast(new Node(4));
	llist1.addToTheLast(new Node(8)); //list1 : 4->8->16
	llist1.addToTheLast(new Node(16));
	
	// Node head2 = new Node();
	llist2.addToTheLast(new Node(1));
	llist2.addToTheLast(new Node(2));  //list2 : 1->2->20
	llist2.addToTheLast(new Node(20));
	
	
	llist1.head = new Solution().sortedMerge(llist1.head,
										llist2.head);
	llist1.printList();	
	
}
}

class Solution
{

    //merging the sorted two node
Node sortedMerge(Node headA, Node headB)
{
	
	
	Node dummyNode = new Node(0);
	
	
	Node tail = dummyNode;
	while(true)
	{
		
		if(headA == null)
		{
			tail.next = headB;
			break;
		}
		if(headB == null)
		{
			tail.next = headA;
			break;
		}
		
		/* Compare the data of the two
		lists whichever lists' data is
		smaller, append it into tail and
		advance the head to the next Node
		*/
		if(headA.data <= headB.data)
		{
			tail.next = headA;
			headA = headA.next;
		}
		else
		{
			tail.next = headB;
			headB = headB.next;
		}
		
		
		tail = tail.next;
	}
	return dummyNode.next;
}
}




