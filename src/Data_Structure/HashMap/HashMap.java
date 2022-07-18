// Java program to illustrate HashMap class of java.util

// Importing HashMap class
import java.util.HashMap;
  

public class HashMap{
  
    public static void main(String[] args)
    {
        // Create an empty hash map by declaring object
        // of string and integer type.
        HashMap<String, Integer> map = new HashMap<>();
  
        // Adding elements to the Map using standard put() method
        map.put("Afreen", 10);
        map.put("Aman", 30);
        map.put("vishal", 20);
  
        // Print size and content of the Map
        System.out.println("Size of map is:- " + map.size());
  
        // Printing elements in object of Map
        System.out.println(map);
  
        // Checking if a key is present and i
        // present, print value by passing
        // random element
        if (map.containsKey("Afreen")) {
  
            // Mapping
            Integer name = map.get("vishal");
  
            // Printing value fr the corresponding key
            System.out.println("value for key" + " \"Afreen\" is:- " + name);
        }
    }
}