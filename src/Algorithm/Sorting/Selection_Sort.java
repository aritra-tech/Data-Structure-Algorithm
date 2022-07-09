package Algorithm.Sorting;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array before DSA.Sorting: " + Arrays.toString(arr));

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;

            // search for the smallest element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }

            // swap the smallest element with the element at i
            if (min != i) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
        System.out.println("Array after DSA.Sorting: " + Arrays.toString(arr));
    }
}
