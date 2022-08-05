#include <stdio.h>
#include <stdlib.h>
struct node
{
	int data;
	struct node *next;
};
struct node *front;
struct node *rear;
void enqueue();
void dequeue();
void display();
void peek();

int main()
{
	int choice = 0;
	while (choice != 4)
	{
		printf("\n1.Enqueue\n2.Dequeue\n3.Peek()\n4.Exit\n");
		printf("\nEnter your choice: ");
		scanf("%d", &choice);
		switch (choice)
		{
		case 1:
			enqueue();
			display();
			break;
		case 2:
			dequeue();
			display();
			break;
		case 3:
			peek();
			break;
		case 4:
			exit(0);
			break;
		default:
			printf("\nEnter valid choice!\n");
		}
	}
}
void enqueue()
{
	struct node *ptr;
	int item;

	ptr = (struct node *)malloc(sizeof(struct node));
	if (ptr == NULL)
	{
		printf("\nOVERFLOW\n");
		return;
	}
	else
	{
		printf("\nEnter value: ");
		scanf("%d", &item);
		ptr->data = item;
		if (front == NULL)
		{
			front = ptr;
			rear = ptr;
			front->next = NULL;
			rear->next = NULL;
		}
		else
		{
			rear->next = ptr;
			rear = ptr;
			rear->next = NULL;
		}
	}
}
void dequeue()
{
	struct node *ptr;
	if (front == NULL)
	{
		printf("\nUNDERFLOW\n");
		return;
	}
	else
	{
		ptr = front;
		front = front->next;
		free(ptr);
	}
}
void display()
{
	struct node *ptr;
	ptr = front;
	if (front == NULL)
	{
		printf("\nEmpty queue\n");
	}
	else
	{
		printf("The queue: ");
		while (ptr != NULL)
		{
			printf("%5d", ptr->data);
			ptr = ptr->next;
		}
		printf("\n");
	}
}

void peek()
{
	if (front == NULL)
	{
		printf("\nEmpty queue\n");
	}
	else
	{
		printf("Peek Element: %d", front->data);
	}
}