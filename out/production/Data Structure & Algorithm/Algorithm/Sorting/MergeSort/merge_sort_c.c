#include <stdio.h>
#include <conio.h>
void mergesort(int[],int,int);
void merge(int[],int,int,int);

int main()
{
    int n,i;
    printf("How many elements you want to insert:");
    scanf("%d",&n);
    int arr[n];
    printf("Enter %d array elements:",n);
    for(i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("\nArray before sorting:\n");
    for(i=0;i<n;i++){
        printf("%d\t",arr[i]);
    }
    mergesort(arr,0,n);
    printf("\nArray after sorting:\n");
    for(int i=0;i<n;i++){
        printf("%d\t",arr[i]);
    }
    return 0;
}

void mergesort(int arr[],int l,int h){
    if(l<h){
        int mid = (l+h)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,h);
        merge(arr,l,mid,h);
    }
}

void merge(int arr[],int l,int mid,int h){
    int i=l;
    int j=mid+1;
    int k=l;
    int dummy[h];
    while(i<=mid && j<=h){
        if(arr[i]<arr[j]){
            dummy[k]=arr[i];
            i++;
            k++;
        }
        else{
            dummy[k]=arr[j];
            j++;
            k++;
        }
    }
   while(i<=mid){
       dummy[k]=arr[i];
       i++;
       k++;
   }
    while(j<=h){
        dummy[k]=arr[j];
        j++;
        k++;
    }
    for(int m=l;m<=h;m++){
        arr[m]=dummy[m];
    }
}

/*
How many elements you want to insert:6
Enter 6 array elements:2 65 33 45 12 90

Array before sorting:
2	65	33	45	12	90	
Array after sorting:
2	12	33	45	65	90	
*/
