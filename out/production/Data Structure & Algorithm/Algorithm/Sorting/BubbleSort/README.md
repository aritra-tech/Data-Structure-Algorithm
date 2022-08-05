## [Watch the video first](https://www.youtube.com/watch?v=bBQkErahU9c)

## Time Complexity: O(n²)

## Java Code Snippet
```
for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    swapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if (!swapped)
                break;
}
```