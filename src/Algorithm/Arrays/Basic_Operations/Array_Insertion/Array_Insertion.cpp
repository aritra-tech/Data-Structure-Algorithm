#include <iostream>
using namespace std;

int main()
{
	int a[100], i, item, position, n;
	
	cout<<"How many elements do you wnat to enter (less than 100) ? ";
	cin>>n;
	
	cout<<"Please enter "<<n<<" elements :";
	for(i=0;i<n;i++)
		cin>>a[i];
		
	cout<<"Enter one more element :";
	cin>>item;
	
	cout<<"Enter the position :";
	cin>>position;
	
	for(i=n-1;i>=position-1;i--)
	a[i+1]=a[i];
	
	a[position-1]=item;
	n=n+1;
	
	cout<<"The new array is :";
	for(i=0;i<n;i++)
		cout<<a[i]<<" ";
}