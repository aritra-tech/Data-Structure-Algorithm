#include <iostream>

using namespace std;
int queue[100], n = 100, front = -1, rear = -1;

bool isEmpty() {
    return (rear == -1 && front == -1);
}
bool isFull() {
    return (rear == n - 1);
}
void Enqueue() {
    int val;
    if (rear == n - 1)
        cout << "Queue Overflow" << endl;
    else {
        if (front == -1)
            front = 0;
        cout << "Insert the element in queue : " << endl;
        cin >> val;
        rear++;
        queue[rear] = val;
    }
}
void Dequeue() {
    if (front == -1 || front > rear) {
        cout << "Queue Underflow " << endl;
        return;
    } else {
        cout << "Element deleted from queue is : " << queue[front] << endl;
        front++;;
    }
}
void Display() {
    if (front == -1)
        cout << "Queue is empty" << endl;
    else {
        cout << "Queue elements are : ";
        for (int i = front; i <= rear; i++)
            cout << queue[i] << " ";
        cout << endl;
    }
}
void Peek() {
    if (isEmpty())
        cout << "Queue is Empty" << endl;
    else
        cout << queue[front] << endl;
}
void Count() {
    cout << rear - front + 1 << endl;
}
int main() {
    int ch;
    cout << "1. Enqueue()" << endl;
    cout << "2. Dequeue()" << endl;
    cout << "3. Peek()" << endl;
    cout << "4. View queue" << endl;
    cout << "5. Count" << endl;
    cout << "6. Exit" << endl;
    do {
        cout << "Enter your choice : " << endl;
        cin >> ch;
        switch (ch) {
        case 1:
            Enqueue();
            break;
        case 2:
            Dequeue();
            break;
        case 3:
            Peek();
            break;
        case 4:
            Display();
            break;
        case 5:
            Count();
            break;
        case 6:
            cout << "Exit" << endl;
            break;
        default:
            cout << "Invalid choice" << endl;
        }
    } while (ch != 6);
    return 0;
}
