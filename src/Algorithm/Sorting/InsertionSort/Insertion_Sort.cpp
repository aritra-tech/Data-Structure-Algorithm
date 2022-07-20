#include <iostream>
using namespace std;

void insertion(int a[], int n){
    int i, j, temp;
    for (i = 1; i < n; i++) {
        temp = a[i];
        j = i - 1;
        while(j>=0 && temp <= a[j])  /* Move the elements greater than temp to one position ahead from their current position*/
        {   a[j+1] = a[j];
            j = j-1;}
        a[j+1] = temp;}}

void Display(int a[], int n){
    int i;
    for (i = 0; i < n; i++)
        cout << a[i] <<" ";}

int main(){
    int a[] = {64, 34, 25, 12, 22, 11, 90};
    int n = sizeof(a) / sizeof(a[0]);
    cout<<"Before sorting - "<<endl;
    Display(a, n);
    insertion(a, n);
    cout<<"\nAfter sorting - "<<endl;
    Display(a, n);
    return 0;}
