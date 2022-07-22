package Algorithm.Searching.BinarySearch;

public class Order_AgnosticBinarySearch {

    public static void main(String[] args){
//        int[] arr ={ 2, 4, 6, 9, 11, 12, 14, 20, 36, 48 }; // ascending order
        int[] arr = { 48, 36, 20, 14, 12, 11, 9, 6, 4, 2 }; // descending order
        int target = 11;

        int ans = orderAgnosticBS(arr, target);
        if (ans == -1) {
            System.out.println("Element not Found");
        }
        else {
            System.out.println("Element Found at Position " + (ans + 1));
        }
    }

    private static int orderAgnosticBS(int[] arr, int target) {

        int s = 0;
        int e = arr.length-1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[s] < arr[e];

        while(s<=e){

            int mid = s + (e - s)/2;

            if (arr[mid] == target){
                return mid;
            }
            // if the array is sorted in ascending order
            if (isAsc){
                if (target > arr[mid]){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
            // if the array is sorted in descending order
            else{
                if (target < arr[mid]){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
        }
        // return -1 if the target element does not exist
        return -1;
    }
}
