#include<bits/stdc++.h>
using namespace std;

/*
n = 4;
   1   
  121
 12321 
1234321  
*/

int main(){
    int row, n;
    cout << "Enter the number: ";
    cin >> n;
    row = 1;
    while(row<=n){
        // Print space
        int space = n - row;
        while(space){
            cout << " ";
            space--;
        }

        // Print 1st triangle
        int col = 1;
        while(col<=row){
            cout << col;
            // cout << "*";    // for star
            col++;
        }

        // Print 2nd triangle
        int num = row - 1;
        while(num){
            cout << num;
            // cout << "*";    // for star
            num--;
        }
        cout << endl;
        row++;
    }


    return 0;
}

/*
# 1st triangle
   1
  12
 123
1234

# 2nd triangle
  1
  21
  321
*/
