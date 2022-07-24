#include <bits/stdc++.h>
using namespace std;

class Node
{
	public:
	int data;
	Node* next;
};

void push(Node** head_ref, int new_data)
{
	/* allocate node */
	Node* new_node =new Node();

	/* put in the data */
	new_node->data = new_data;

	/* link the old list off the new node */
	new_node->next = (*head_ref);

	/* move the head to point to the new node */
	(*head_ref) = new_node;
}

/* Counts no. of nodes in linked list */
int getCount(Node* head)
{
	int count = 0;
	Node* current = head;
	while (current != NULL)
	{
		count++;
		current = current->next;
	}
	return count;
}

// Driver program
int main()
{
	
	Node* head = NULL;

	/* Use push() to construct below list
	1->2->1->3->1 */
	push(&head, 1);
	push(&head, 3);
	push(&head, 1);
	push(&head, 2);
	push(&head, 1);

	/* Check the count function */
	cout<<"count of nodes is "<< getCount(head);
	return 0;
}

// This is code is contributed by rathbhupendra
