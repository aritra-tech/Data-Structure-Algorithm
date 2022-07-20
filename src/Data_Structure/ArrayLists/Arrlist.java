package Data_Structure.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Arrlist {
    public static void main(String[] args) {

        //initialising ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //adding elements to the Arraylist -> add(value)
        list.add(3);
        list.add(45);
        list.add(52);
        list.add(2);
        list.add(51);
        list.add(74);

        System.out.println(list);

        //adding elements in between the list -> add(index,element)
        list.add(3, 7);

        System.out.println(list);

        //printing element from a specific position -> get(index)
        int new_ele = list.get(6);
        System.out.println(new_ele);

        //Modifying elements -> set(index,element)
        list.set(2, 34);
        System.out.println(list);

        //Deleting elements -> remove(index)
        list.remove(0);
        System.out.println(list);

        //Size of an arraylist -> size()
        int size = list.size();
        System.out.println(size);

        //Sorting the ArrayList -> Collections.sort(list)
        Collections.sort(list);
        System.out.println(list);

        //for loop iteration in ArrayList
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // for each loop
        for (int val : list) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
