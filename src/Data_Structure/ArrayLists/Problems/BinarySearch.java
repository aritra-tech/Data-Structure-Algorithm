package Data_Structure.ArrayLists.Problems;

import java.util.ArrayList;
  
class BinarySearch 
{ 
    // Returns index of x if it is present in arr[], 
    // else return -1 
    int binarySearch(ArrayList<Integer> arr, int x) 
    { 
        int left = 0, right = arr.size() - 1; 
        
        while (left <= right)
        { 
            int mid = left + (right - left) / 2; 
    
            // Check if x is present at mid 
            if (arr.get(mid) == x) 
                return mid; 
    
            // If x greater, ignore left half 
            if (arr.get(mid) < x) 
                left = mid + 1; 
    
            // If x is smaller, ignore right half 
            else
                right = mid - 1; 
        } 
    
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
    
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        arr.add(5);
        arr.add(10);
        arr.add(15);
        arr.add(20);
        arr.add(25);
        arr.add(30);
        arr.add(35); 
        
        int x = 10; 
        
        // Printing elements of array list
        System.out.println("The elements of the arraylist are: "+arr);
        
        int result = ob.binarySearch(arr, x); 
        
        if (result == -1) 
            System.out.println("Element not present"); 
        
        else
            System.out.println("The Element " + x + " is found at "
                               + "index " + result); 
    } 
} 
