package Algorithm.Arrays.Basic_Operations.Array_Element_Deletion;


import java.util.Arrays;

public class Array_Element_Deletion{

    public static void main(String args[]) {

        int[] arr = { 1, 2, 3, 4, 5 };

        // Print the resultant array
        System.out.println("Original Array: "
                + Arrays.toString(arr));

        // Get the specific index
        int index = 2;

        // Print the index
        System.out.println("Index to be removed: " + index);

        // Remove the element
        arr = removeTheElement(arr, index);

        // Print the resultant array
        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }

    private static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
}
