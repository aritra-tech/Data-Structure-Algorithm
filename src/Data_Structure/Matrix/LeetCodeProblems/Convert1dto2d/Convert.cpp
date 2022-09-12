#include <iostream>
#include <bits/stdc++.h>
using namespace std;

vector<vector<int>> construct2DArray(vector<int> &original, int m, int n)
{
    /*Creating 2d array fristly */
    vector<vector<int>> v;
    /*if No. of elements in 1d array not equal to 2D 
    array size then return v*/
    if (original.size() != m * n)
    {
        return v;
    }
    /* And if it does then simply citerate over
    the 2d array v and put the value of 1D array into it*/
    else
    {
        int k = 0;
        for (int i = 0; i < m; i++)
        {
            vector<int> temp;
            for (int j = 0; j < n; j++)
            {
                temp.push_back(original[k]);
                /*Here k is helping us to iterate over the 
                1D array and pushing elemnts into the 2D array*/
                k++;
            }
            v.push_back(temp);
        }
        return v;
    }
}

int main(){
    vector<int> original = {1,2,3,4};
    int m = 2;
    int n = 2;
    vector<vector<int>> output = construct2DArray(original,m,n);
    for (int i = 0; i < m; i++)
    {
        for (int j = 0; j < n ; j++)
        {
            printf("%d",output[i][j]);
        }        
    }    
}

/*
OUTPUT
 {{1,2},
 {3,4}};
*/