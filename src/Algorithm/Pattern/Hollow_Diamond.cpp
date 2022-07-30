#include <iostream>
using namespace std;

int main()
{
	int i, j, space, k = 0, n;
	cout << "\nEnter the number of rows : ";
	cin >> n;
	for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n-i; j++)
				{
					cout <<" ";
				}
	while (k != (2 * i-1))
		{
			if (k == 0 or k == 2 * i-2)
				cout << "*";	
			else	
				cout << " ";
			k++;
		}
	k = 0;
	cout << endl;
	}
	n--;
	for (i = n; i >= 1; i--)
	{
		for (j = 0; j <= n-i; j++)
			{
				cout << " ";
			}
		k = 0;
		while (k != (2 * i-1))
		{
			if (k == 0 or k == 2 * i-2)
				cout <<"*";
			else
				cout << " ";
			k++;
		}
	cout << endl;
	}
}

/*

Enter the number of rows : 5
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/