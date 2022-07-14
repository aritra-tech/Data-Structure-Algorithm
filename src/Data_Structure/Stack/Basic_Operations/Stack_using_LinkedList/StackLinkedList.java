package Data_Structure.Stack.Basic_Operations.Stack_using_LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

class stack {
    private int top;
    private LinkedList<Integer> list;
    private int n;

    public stack(int n) {
        top = -1;
        this.n = n;
        list = new LinkedList<>();
    }

    // this tells if the stack is empty or not
    public boolean isEmpty() {
        return top == -1;
    }

    // this tells if the stack is full or not
    public boolean isFull() {
        return top == (n - 1);
    }

    // this will place an item on the stack
    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            list.add(val);
        }
    }

    // this will return the item at the top of the stack and then remove it
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return list.remove(top--);
        }
    }

    // this will return the no of items in the stack
    public int count() {
        return (top + 1);
    }

    // this will return top value of a stack
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        }
        return list.get(top);
    }

    // this will access the value at given position
    public int peek(int pos) {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return list.get(pos-1);
        }
    }

    // this will update the value of a given position
    public void updateValue(int pos, int val) {
        if (pos > count()) {
            System.out.println("Stack Overflow");
        } else {
            list.set(pos-1, val);
            System.out.println("Value Updated at position " + pos);
        }

    }

    // display all the items of the stack
    void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("All values in the Stack are: ");
            for (int i = top; i >= 0; i--) {
                System.out.println(list.get(i));
            }
        }
    }
}


public class StackLinkedList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Stack: ");
        int n = sc.nextInt();
        stack st = new stack(n);

        boolean flag = true;
        int val;
        int pos = 0;
        while (flag) {

            System.out.println("1. Push item in Stack");
            System.out.println("2. Pop item out from Stack");
            System.out.println("3. Current size of stack");
            System.out.println("4. Update value at position");
            System.out.println("5. View value at position");
            System.out.println("6. View Stack");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    st.push(val);
                    break;

                case 2:
                    System.out.println(st.pop());
                    break;

                case 3:
                    System.out.println(st.count());
                    break;

                case 4:
                    System.out.print("Enter value: ");
                    val = sc.nextInt();
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    st.updateValue(pos, val);
                    break;

                case 5:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    st.peek(pos);
                    break;

                case 6:
                    st.display();
                    break;

                case 7:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println();
        }

    }

}


