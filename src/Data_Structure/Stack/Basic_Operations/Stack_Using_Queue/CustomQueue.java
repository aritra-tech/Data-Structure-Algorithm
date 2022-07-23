package Data_Structure.Stack.Basic_Operations.Stack_Using_Queue;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = -1;

    CustomQueue(){
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        this.data = new int[size];
    }

    boolean inxert(int item){
        if(isFull()){
            return false;
        }
        end++;
        data[end]= item;
        return true;
    }

    int remove(){

        int removed = data[0];

        //shift the elements to left of their initial position
        for (int i = 1; i <=end; i++) {
            data[i-1]=data[i];
        }
        end--;

        return removed;
    }

    void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + "<--");
        }
        System.out.println("End");
    }

    boolean isFull(){
        return end == data.length -1;
    }
    boolean isEmpty(){
        return end == -1;
    }
}
