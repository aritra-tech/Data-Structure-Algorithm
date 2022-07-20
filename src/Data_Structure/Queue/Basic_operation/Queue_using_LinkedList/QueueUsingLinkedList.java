package Data_Structure.Queue.Basic_operation.Queue_using_LinkedList;

import java.util.*;

class Node {
	protected int data;
	protected Node link;

	public Node() {
		link = null;
		data = 0;
	}

	public Node(int d, Node n) {
		data = d;
		link = n;
	}

	public void setLink(Node n) {
		link = n;
	}

	public void setData(int d) {
		data = d;
	}

	public Node getLink() {
		return link;
	}

	public int getData() {
		return data;
	}
}

class linkedQueue {
	protected Node front, rear;
	public int size;

	public linkedQueue() {
		front = null;
		rear = null;
		size = 0;
	}

	public boolean isEmpty() {
		return front == null;
	}

	public int getSize() {
		return size;
	}

	public void insert(int data) {
		Node nptr = new Node(data, null);
		if (rear == null) {
			front = nptr;
			rear = nptr;
		} else {
			rear.setLink(nptr);
			rear = rear.getLink();
		}
		size++;
	}

	public int remove() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		Node ptr = front;
		front = ptr.getLink();
		if (front == null)
			rear = null;
		size--;
		return ptr.getData();
	}

	public int peek() {
		if (isEmpty())
			throw new NoSuchElementException("Underflow Exception");
		return front.getData();
	}

	public void display() {
		System.out.print("\nQueue = ");
		if (size == 0) {
			System.out.print("Empty\n");
			return;
		}
		Node ptr = front;
		while (ptr != rear.getLink()) {
			System.out.print(ptr.getData() + " ");
			ptr = ptr.getLink();
		}
		System.out.println();
	}
}

public class QueueUsingLinkedList {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		linkedQueue lq = new linkedQueue();

		System.out.println("Linked Queue Test\n");
		char ch;
		do {
			System.out.println("\nQueue Operations");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peek()");
			System.out.println("4. Size");
			System.out.println("5. Exit");
			int choice = scan.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter integer element to enqueue");
					lq.insert(scan.nextInt());
					break;
				case 2:
					try {
						System.out.println("Dequeued Element = " + lq.remove());
					} catch (Exception e) {
						System.out.println("Error : " + e.getMessage());
					}
					break;
				case 3:
					try {
						System.out.println("Peek Element = " + lq.peek());
					} catch (Exception e) {
						System.out.println("Error : " + e.getMessage());
					}
					break;
				case 4:
				System.out.println("Size = " + lq.getSize());
					break;

				case 5:
					System.exit(0);
					break;

				default:
					System.out.println("Wrong Entry \n ");
					break;
			}

			lq.display();
		} while (true);
	}
}