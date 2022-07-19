#include <stdio.h>

void cycleSort(int a[], int n)
{
	int start, element, pos, temp, i;

	for (start = 0; start <= n - 2; start++)
	{
		element = a[start];

		pos = start;

		for (i = start + 1; i < n; i++)
			if (a[i] < element)
				pos++;
		if (pos == start)
			continue;
		while (element == a[pos])
			pos += 1;
		if (pos != start)
		{

			temp = element;
			element = a[pos];
			a[pos] = temp;
		}

		while (pos != start)
		{
			pos = start;

			for (i = start + 1; i < n; i++)
				if (a[i] < element)
					pos += 1;

			while (element == a[pos])
				pos += 1;

			if (element != a[pos])
			{
				temp = element;
				element = a[pos];
				a[pos] = temp;
			}
		}
	}
}

void print(int a[], int n)
{
	int i;
	for (i = 0; i < n; i++)
	{
		printf("%d ", a[i]);
	}
}

int main()
{
	int a[] = {1, 6, 3, 11, 10, 10, 5, 2};
	int n = sizeof(a) / sizeof(a[0]);
	printf("After sort : \n");
	cycleSort(a, n);
	print(a, n);
	return 0;
}