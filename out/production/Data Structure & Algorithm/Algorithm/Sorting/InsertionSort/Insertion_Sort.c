#include <stdio.h>
#include <math.h>

void InsertionSort(int a[], int n){
    int i, j, temp;
    for (i = 1; i < n; i++) {
        temp = a[i];
        j = i - 1;
        while(j>=0 && temp <= a[j])  /* Move the elements greater than temp to one position ahead from their current position*/
        {   a[j+1] = a[j];
            j = j-1;}
        a[j+1] = temp;}}

void DisplayArray(int a[], int n){
    int i;
    for (i = 0; i < n; i++)
        printf("%d ", a[i]);}

int main() {
    int a[] = { 64, 34, 25, 12, 22, 11, 90 };
    int n = sizeof(a) / sizeof(a[0]);
    printf("Before sorting - \n");
    DisplayArray(a, n);
    InsertionSort(a, n);
    printf("\nAfter sorting - \n");
    DisplayArray(a, n);
    return 0;}
