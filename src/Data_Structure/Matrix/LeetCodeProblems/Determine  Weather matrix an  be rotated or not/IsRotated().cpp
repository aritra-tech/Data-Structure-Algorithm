#include<iostream>
#include<bits/stdc++.h>
#include<vector>
using namespace std;

bool findRotation(vector<vector<int>> &mat, vector<vector<int>> &target)
{
    for (int i = 0; i < 4; i++)
    {
        int n = mat.size();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < i; j++)
                swap(mat[i][j], mat[j][i]);

        for (int i = 0; i < n; i++)
            reverse(mat[i].begin(), mat[i].end());
        /*We are swaping the [i][j] to [j][i] as its 
        90 degree rotated and then reversing the row 
        then chcecking if mat is rotated 90 degree = 
        target matrix return true*/
        if (mat == target)
            return true;
    }

    return false;
}

int main(){
    vector<vector<int>> mat = {{0,0,0},{0,1,0},{1,1,1}};
    vector<vector<int>> target =  {{1,1,1},{0,1,0},{0,0,0}};
    bool output = findRotation(mat,target);
    cout<<output<<endl;
}

/*OUTPUT
 TRUE
*/
