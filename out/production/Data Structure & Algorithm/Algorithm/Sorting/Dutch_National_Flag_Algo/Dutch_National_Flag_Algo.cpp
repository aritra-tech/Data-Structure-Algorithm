#include <iostream>
#include <vector>

using namespace std;

void sort012(vector<int> &arr);

int main()
{
    int n;
    vector<int> arr;

    cin >> n;

    for (int i = 0; i < n; ++i)
    {
        int temp;
        cin >> temp;
        arr.push_back(temp);
    }

    sort012(arr);

    for (int i = 0; i < n; ++i)
        cout << arr[i] << " ";

    return 0;
}

void sort012(vector<int> &arr)
{
    int n = arr.size();

    /* low, mid and high represent the positions with which swapping
        of 0's, 1's and 2's respectively will be done */
    int low = 0, mid = 0, high = n - 1;

    while (mid <= high)
    {
        if (arr[mid] == 0)
        {
            swap(arr[low], arr[mid]);
            low++, mid++;
        }
        else if (arr[mid] == 1)
        {
            mid++;
        }
        else
        {
            swap(arr[mid], arr[high]);
            high--;
        }
    }
}