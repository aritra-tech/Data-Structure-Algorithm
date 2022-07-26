import java.io.*;
import java.util.*;
public class LinkedtoHash {
    public static void main(String[] args) {
        HashMap<Integer, Integer> l = new HashMap<>();
        l.put(2,5);
        l.put(3, 6);
        l.put(4, 1);
        l.put(8,2);

        List<Integer> list = new LinkedList<>(l.keySet());
        List<Integer> listofValue = new LinkedList<>(l.values());

        System.out.println("LinkedList of Keys -> " + list);
        System.out.println("LinkedList of Values -> " + listofValue);

    }
}
