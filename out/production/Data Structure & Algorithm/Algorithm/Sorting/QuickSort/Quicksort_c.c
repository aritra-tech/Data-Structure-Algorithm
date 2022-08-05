#include <stdio.h>
// function to swap elements
void swap(int *a, int *b) {
  int t = *a;
  *a = *b;
  *b = t;
}

// Partition function
int partition(int array[], int low, int high) {
	int j;
  	int pivot = array[high];

  	int i = (low - 1);

  	for (j = low; j < high; j++) {
    if (array[j] <= pivot) {    
      	i++;
      	swap(&array[i], &array[j]);
    	}
  	}
  	swap(&array[i + 1], &array[high]);
  	return (i + 1);
}

//function of Quick Sort
void quickSort(int array[], int low, int high) {
  	if (low < high) {
    
    // find the pivot element such that
    // elements smaller than pivot are on left of pivot
    // elements greater than pivot are on right of pivot
    int pi = partition(array, low, high);
    
    quickSort(array, low, pi - 1);
    quickSort(array, pi + 1, high);
  }
}

// function to print array elements
void printArray(int array[], int size) {
	int i;
  	for (i = 0; i < size; ++i) {
    printf("%d  ", array[i]);
  }
printf("\n");
}

// main function
int main() {
  	int data[] = {8, 7, 2, 1, 0, 9, 6};
  
  	int n = sizeof(data) / sizeof(data[0]);
  
  	printf("Unsorted Array\n");
  	printArray(data, n);
  	quickSort(data, 0, n - 1);
  
  	printf("Sorted array in ascending order: \n");
  	printArray(data, n);
}
