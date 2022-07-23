package Data_Structure.Stack.Basic_Operations.Stack_Using_Queue;

public class ImpStackUsingQueue {


        CustomQueue queue1 = new CustomQueue();
        CustomQueue queue2 = new CustomQueue();

        boolean insert(int item) {
            if (queue1.isFull()){
                return false;
            }
            while (!queue1.isEmpty()) {
                queue2.inxert(queue1.remove());
            }
            queue1.inxert(item);
            while(!queue2.isEmpty()){
                queue1.inxert(queue2.remove());
            }
            return true;
        }
        void delete(){
            queue1.remove();
            System.out.println("Item Deleted;");
        }
        void displayS(){
            for (int i = 0; i<=queue1.end; i++) {
                System.out.print(queue1.data[i] +"<--");
            }
            System.out.println("End");
        }

    public static void main(String[] args) {
        ImpStackUsingQueue demoStack = new ImpStackUsingQueue();
        demoStack.insert(5);
        demoStack.insert(10);
        demoStack.insert(15);
        demoStack.delete();
        demoStack.insert(50);
        demoStack.displayS();
    }
}





