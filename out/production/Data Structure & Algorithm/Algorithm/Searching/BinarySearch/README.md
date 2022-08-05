### [Video Reference](https://youtu.be/f6UU7V3szVw)
### Time Complexity: O(log n), where n is the size of the array

## Binary Search (when you know in which order the array is sorted):
```
private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2; // same thing, this will never exceed the int range
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        // return -1 if the target element does not exist
        return -1;
    }
```

