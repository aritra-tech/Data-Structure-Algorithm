//Question: Search an Element in the array using Linear Search Technique

package DSA.Searching;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,50,70,90};
        int element = 50;
        int res = linearSearch(arr, element);
        if(res == -1)
            System.out.println("Element not Found");
        else
            System.out.println("Element Found at position " + res);
    }

    private static int linearSearch(int[] arr, int element) {
        if(arr.length == 0)
            return -1;

        for(int i = 0; i < arr.length; i++)
        {
            // find the first occurrence of the element and return it's position
            if(arr[i] == element) {
                return i + 1;
            }
        }
        return -1;
    }
}
