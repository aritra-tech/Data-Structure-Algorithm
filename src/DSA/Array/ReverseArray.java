
/**
 * <br> Problem Statement :
 *
 * Given an array (or string), the task is to reverse the array/string.
 *
 * Example 1 :
 *
 * Input  : arr[] = {1, 2, 3}
 * Output : arr[] = {3, 2, 1}
 *
 * </br>
 *
 */


package DSA.Array;
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int len = arr.length;
        System.out.println("Original Array: " + Arrays.toString(arr));

//		reverseIteratively(arr, len);
        System.out.println("Iterative Reverse: " + Arrays.toString(arr));

        reverseRecursively(arr, 0, len - 1);
        System.out.println("Recursive Reverse: " + Arrays.toString(arr));
    }
    public static int[] reverseIteratively(int arr[], int length) {
        int s = 0, e = length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        return arr;
    }

    public static void reverseRecursively(int arr[], int s, int e) {
        if (s >= e)
            return;
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
        reverseRecursively(arr, ++s, --e);
    }
}
