## [Watch the YouTube video first](https://youtu.be/nJ6FdAIr_6g)

# Algorithm for heap sort

HeapSort(arr)  
BuildMaxHeap(arr)  
for i = length(arr) to 2  
    swap arr[1] with arr[i]  
        heap_size[arr] = heap_size[arr] ? 1  
        MaxHeapify(arr,1)  
End 

BuildMaxHeap(arr)  
    heap_size(arr) = length(arr)  
    for i = length(arr)/2 to 1  
MaxHeapify(arr,i)  
End 

MaxHeapify(arr,i)  
L = left(i)  
R = right(i)  
if L ? heap_size[arr] and arr[L] > arr[i]  
largest = L  
else  
largest = i  
if R ? heap_size[arr] and arr[R] > arr[largest]  
largest = R  
if largest != i  
swap arr[i] with arr[largest]  
MaxHeapify(arr,largest)  
End   

## Source: JAVATPOINT

## Time Complexity

O(nlogn)