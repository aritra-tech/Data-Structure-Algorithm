package Striver_SDE_Sheet.Stack_and_Queue.Stack_Using_Array;

class StackUsingArray{
    int size = 10000;
    int[] arr = new int[size];
    int top = -1;
    public void push(int x) {
        top++;
        arr[top] = x;
    }
    public int pop() {
        int x = arr[top];
        top--;
        return x;
    }
    public int top() {
        return arr[top];
    }
    public int size() {
        return top + 1;
    }
}
public class ImplementStackusingArray {
    public static void main(String[] args){

        StackUsingArray st = new StackUsingArray();
        st.push(5);
        st.push(8);
        st.push(4);
        System.out.println("Top of the stack before deleting any element " + st.top());
        System.out.println("Size of the stack before deleting any element " + st.size());
        System.out.println("The element deleted is " + st.pop());
        System.out.println("Size of the stack after deleting an element " + st.size());
        System.out.println("Top of the stack after deleting an element " + st.top());
    }
}
