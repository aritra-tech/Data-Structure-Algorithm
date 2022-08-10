#include <iostream>
using namespace std;
int main()
{
int i, j, n;
cin >> n;  // 'n' must be odd
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
{
// left diagonal, right diagonal, top horizontal, bottom horizontal, left vertical, right vertical
if(i == j || i + j == n - 1 || i == 0 || i == n - 1 || j == 0 || j == n - 1)
cout << "*";
else
cout << " ";
}
cout << "\n";
}
return 0;
}