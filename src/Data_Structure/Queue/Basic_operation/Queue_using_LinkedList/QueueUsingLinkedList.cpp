#include <iostream>
using namespace std;

struct Node
{
	int data;

	Node *link;
};

Node *front = NULL;
Node *rear = NULL;

bool isempty()
{
	if (front == NULL && rear == NULL)
		return true;
	else
		return false;
}

void enqueue(int value)
{
	Node *ptr = new Node();
	ptr->data = value;
	ptr->link = NULL;

	if (front == NULL)
	{
		front = ptr;
		rear = ptr;
	}
	else
	{
		rear->link = ptr;
		rear = ptr;
	}
}

void dequeue()
{
	if (isempty())
		cout << "Queue is empty\n";
	else

		if (front == rear)
	{
		free(front);
		front = rear = NULL;
	}
	else
	{
		Node *ptr = front;
		front = front->link;
		free(ptr);
	}
}

void peek()
{
	if (isempty())
		cout << "Queue is empty\n";
	else
		cout << "Peek element: " << front->data;
}

void displayQueue()
{
	if (isempty())
		cout << "Queue is empty\n";
	else
	{
		cout << "\nQueue: ";
		Node *ptr = front;
		while (ptr != NULL)
		{
			cout << ptr->data << " ";
			ptr = ptr->link;
		}
		cout << "\n";
	}
}

int main()
{
	int choice, flag = 1, value;
	while (flag == 1)
	{
		cout << "\n1.Enqueue\n2.Dequeue\n3.Peek()\n4.exit\n";
		cout << "Enter choice: ";
		cin >> choice;
		switch (choice)
		{
		case 1:
			cout << "Enter Value: ";
			cin >> value;
			enqueue(value);
			displayQueue();
			break;
		case 2:
			dequeue();
			displayQueue();
			break;
		case 3:
			peek();
			break;
		case 4:
			flag = 0;
			break;
		}
	}

	return 0;
}