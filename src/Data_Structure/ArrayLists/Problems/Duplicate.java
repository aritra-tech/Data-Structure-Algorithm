import java.util.ArrayList;
  
// Importing the HashSet class
import java.util.HashSet;
  
class Duplicate {
    public static void main(String[] args)
    {
  
        // Input
        int array[] = { 1, 1, 1, 1, 1, 1, 1, 1 };
  
        // Creating an empty ArrayList
        ArrayList<Integer> ans = new ArrayList<>();
  
        // Creating an empty HashSet
        HashSet<Integer> set = new HashSet<>();
  
        for (int i : array) {
  
            // Checking if the element is already present or
            // not
            if (!set.contains(i)) {
                // Adding the element to the ArrayList if it
                // is not present
                ans.add(i);
                // Adding the element to the HashSet if it
                // is not present
                set.add(i);
            }
        }
  
        // Printing the elements of the ArrayList
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}