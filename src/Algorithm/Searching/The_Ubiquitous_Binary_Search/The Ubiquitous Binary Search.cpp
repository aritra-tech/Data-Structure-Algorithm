#include <bits/stdc++.h>
using namespace std;

int BinarySearchIndexOfMinimumRotatedArray(int A[], int l, int r)
{
	// extreme condition, size zero or size two
	int m;

	// Precondition: A[l] > A[r]
	if( A[l] >= A[r] )
		return l;

	while( l <= r )
	{
		// Termination condition (l will eventually falls on r, and r always
		// point minimum possible value)
		if( l == r )
			return l;

		m = l + (r-l)/2; // 'm' can fall in first pulse,
						// second pulse or exactly in the middle

		if( A[m] < A[r] )
			// min can't be in the range
			// (m < i <= r), we can exclude A[m+1 ... r]
			r = m;
		else
			// min must be in the range (m < i <= r),
			// we must search in A[m+1 ... r]
			l = m+1;
	}

	return -1;
}

int main()
{
	int arr[] = { 2, 3, 4, 10, 40 };
	int x = 10;
	int n = sizeof(arr) / sizeof(arr[0]);
	int result = BinarySearchIndexOfMinimumRotatedArray(arr, 0, n-1);
	(result == -1)
		? cout << "Element is not present in array"
		: cout << "Element is present at index " << result;
	return 0;
}