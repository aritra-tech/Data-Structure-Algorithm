//The PriorityQueue is based on the priority heap. 
//The elements of the priority queue are ordered according to the natural ordering, 
// or by a Comparator provided at queue construction time, depending on which constructor is used.  


import java.util.*;
public class PriorityQueueDemo {
    public static void main(String args[])
    {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
  
        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
  
        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());
  
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());
  
        // Printing the top element again
        System.out.println(pQueue.peek());

        // Insertion of Element
        for(int i=0;i<3;i++){
            pQueue.add(i);
            pQueue.add(1);
        }
        System.out.println(pQueue);
    }
}
