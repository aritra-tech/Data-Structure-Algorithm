package Data_Structure.Stack.Basic_Operations.Stack_using_CollectionFrameWork;

import java.util.Stack;

public class StackCF {
    public static void main(String[] args){
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);

        while (!sc.isEmpty()){
            System.out.println(sc.peek());
            sc.pop();
        }
    }
}
