package Data_Structure.Queue.Basic_operation.Queue_using_Stack;

import java.util.Scanner;
import java.util.Stack;

public class QueueUsingStack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        static int size = 0;

        static void enQueue(int x) {
            while (!s1.isEmpty()) { // Move all elements from s1 to s2
                s2.push(s1.pop());
            }
            size++;
            s1.push(x); // Push item into s1

            while (!s2.isEmpty()) { // Push everything back to s1
                s1.push(s2.pop());
            }
            System.out.println(x + " Enqueued");
        }

        static int top() {
            if (size > 0)
                return s1.peek();
            return -1;
        }

        static int size() {
            return size;
        }

        static int deQueue() {  // Dequeue an item from the queue
            if (s1.isEmpty()) { // if first stack is empty
                System.out.println("Q is Empty");
                return size-1;
            }
            size--;
            int x = s1.peek();  // Return top of s1
            s1.pop();
            return x;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        boolean loop = true;
        System.out.println("Enter your operation: ");
        while (loop) {
            System.out.println("1. Enqueue\n2. Dequeue\n3. Top\n4. Size\n5. Exit");
            int n = sc.nextInt();
            switch (n) {
                case 1-> {
                    System.out.println("Enter the data: ");
                    int x = sc.nextInt();
                    q.enQueue(x);
                }
                case 2-> System.out.println(q.deQueue());
                case 3-> System.out.println(q.top());
                case 4-> System.out.println(q.size());
                case 5-> System.exit(0);
                default -> System.out.println("Wrong Input!");
            }
        }
    }
}
