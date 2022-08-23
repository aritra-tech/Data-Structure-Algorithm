// JAVA program to print intersection of lists
package Striver_SDE_Sheet.Linked_List.IntersactionOfLinkedList;

import java.util.*;

public class IntersactionOfLinkedList{

/* Link list node */
static class Node {
	int data;
	Node next;
};

// A utility function to return intersection node
static Node intersectPoint(Node head1, Node head2)
{
	// Maintaining two pointers ptr1 and ptr2
	// at the head of A and B,
	Node ptr1 = head1;
	Node ptr2 = head2;

	// If any one of head is null i.e
	// no Intersection Point
	if (ptr1 == null || ptr2 == null) {

		return null;
	}

	// Traverse through the lists until they
	// reach Intersection node
	while (ptr1 != ptr2) {

		
	    ptr1 = ptr1 ==null ? head2 : ptr1.next;
		 // if ptr1 reach to null then reassgin it to head 2
	     
	    ptr2 = ptr2 == null ? head1 :ptr2.next;  
		// if ptr2 reach to null then reassign it to haed 1
	
	}

	return ptr1;
}

// Function to print intersection nodes
// in a given linked list
static void print(Node node)
{
	if (node == null)
		System.out.print("null");
	while (node.next != null) {
		System.out.print(node.data+ ".");
		node = node.next;
	}
	System.out.print(node.data);
}

// Driver code
public static void main(String[] args)
{
	/*
	Create two linked lists

	1st Linked list is 3.6.9.15.30
	2nd Linked list is 10.15.30

	15 30 are elements in the intersection list
	*/

	Node newNode;
	Node head1 = new Node();
	head1.data = 10;
	Node head2 = new Node();
	head2.data = 3;
	newNode = new Node();
	newNode.data = 6;
	head2.next = newNode;
	newNode = new Node();
	newNode.data = 9;
	head2.next.next = newNode;
	newNode = new Node();
	newNode.data = 15;
	head1.next = newNode;
	head2.next.next.next = newNode;
	newNode = new Node();
	newNode.data = 30;
	head1.next.next = newNode;
	head1.next.next.next = null;
	Node intersect_node = null;

	// Find the intersection node of two linked lists
	intersect_node = intersectPoint(head1, head2);

	System.out.print("INTERSEPOINT LIST :");

	print(intersect_node);
}
}


