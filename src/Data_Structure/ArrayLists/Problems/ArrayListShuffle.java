package Data_Structure.ArrayLists.Problems;

import java.util.*;
class ArraylistShuffle {
    public static void main(String args[])
    {
        // creating ArrayList
        ArrayList<String> al = new ArrayList<String>();
  
        // adding object in ArrayList
        al.add("C");
        al.add("C++");
        al.add("Java");
        al.add("Python");
        al.add("PHP");
        al.add("Javascript");
  
        System.out.println("Before shuffling Arraylist:");
  
        // getting Iterator
        // from arraylist to
        // traverse elements
        Iterator itr = al.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
  
        System.out.println("");
  
        Collections.shuffle(al);
  
        System.out.println("After shuffling Arraylist:");
  
        itr = al.iterator();
  
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}