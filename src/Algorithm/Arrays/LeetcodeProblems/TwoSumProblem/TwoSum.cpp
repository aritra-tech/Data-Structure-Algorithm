#include <bits/stdc++.h>
using namespace std;

vector <int> targetSum(vector <int> &a , int &target)
{
    int n = a.size();
    for(int i = 0 ; i < n - 1 ; i++)
        for(int j = i + 1 ; j < n ; j++)
        {
            if(a[i] + a[j] == target)
                return {i + 1 , j + 1};
        }
    return {};
}
int main()
{
    vector <int> a = {1 , 4 , 5 , 11 , 12};
    int target = 9;
    for(int &x : targetSum(a , target))
        cout << x << " ";
    cout << '\n';
}