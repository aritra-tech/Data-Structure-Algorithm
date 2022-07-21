#include <iostream>

using namespace std;
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


void mergesort(int arr[],int l,int h){
    if(l<h){
        int mid = (l+h)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,h);
        merge(arr,l,mid,h);
    }
}


int main()
{
    int n;
    cout<<"How many elements you want to insert:";
    cin>>n;
    int arr[n];
    cout<<"Enter "<<n<<" array elements:";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"\nArray before sorting:"<<"\n";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<"\t";
    }
    mergesort(arr,0,n);
    cout<<"\nArray after sorting:"<<"\n";
    for(int i=0;i<n;i++){
        cout<<arr[i]<<"\t";
    }
    return 0;
}

/*
How many elements you want to insert:7
Enter 7 array elements:23 78 11 678 90 234 780

Array before sorting:
23      78      11      678     90      234     780
Array after sorting:
11      23      78      90      234     678     780

...Program finished with exit code 0
Press ENTER to exit console.
*/