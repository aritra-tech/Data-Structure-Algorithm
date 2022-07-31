#include<bits/stdc++.h> 
using namespace std; 
 
// function to find maximum water stored.
int maxWater(int arr[],int n)
{
    int maxArea = 0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        maxArea = max(maxArea,min(arr[i],arr[j])*(j-i));
    }
    return maxArea;
}
// main function to implement above functions
int main() 
{ 
  int arr[] = {1, 3, 6, 7, 3, 2, 3, 1}; 
  int n = sizeof(arr)/sizeof(arr[0]);
  
  cout<<"Maximum water stored = "<<maxWater(arr,n)<<endl;
  return 0;
} 