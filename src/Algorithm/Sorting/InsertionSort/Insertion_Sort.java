package Algorithm.Sorting.InsertionSort;

import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        System.out.println("Array before DSA.Sorting: " + Arrays.toString(arr));

        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        System.out.println("Array after DSA.Sorting: " + Arrays.toString(arr));
    }
}
