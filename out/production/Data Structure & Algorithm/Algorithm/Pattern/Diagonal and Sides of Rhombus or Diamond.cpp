#include <iostream>
using namespace std;
int main()
{
int i, j, n;
cin >> n;  // ‘n’ must be odd
int num1 = n / 2 * 3;
for(i = 0; i < n; i++)
{
for(j = 0; j < n; j++)
{
// center horizontal, center vertical, upper left diagonal, bottom left diagonal, upper right diagonal, bottom right diagonal
if(i == n / 2 || j == n / 2 || i + j == n / 2 || i - j == n / 2 || j - i == n / 2 || i + j == num1)
cout << "*";
else
cout << " ";
}
cout << "\n";
}
return 0;

}
