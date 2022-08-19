#include<iostream>
#include<vector>
#include<bits/stdc++.h>
using namespace std;

/* Their are 2 types of searching 
-Linear
-Binary
But for optimization purpose Binary 
Search is used (BUT FOR BINARY SEARCH MATRIX HAVE TO BE SORT ORDER)*/
bool searchMatrix(vector<vector<int>>& matrix, int target) {
    /* Row number & col number */
    int row = matrix[0].size();
    int col = matrix.size();
    /*For Binary search start = 0 & end = (row * col) - 1*/
    int start = 0;
    int end = (row * col) - 1;
    /* Corner case */
    if(!matrix.size()){
        return false;
    }
    /* Now applying binary seach */
    while(start <= end){
        int mid = (start + end)/2;
        /* If the matrix[i][j] = element then return true
         otherwise if element less than target move mid forward & vice versa*/       
        if(matrix[mid / row][mid / col] == target)return true;
        if(matrix[mid / row][mid / col] < target)
        {
            start = mid + 1;
        }
        else if(matrix[mid / row][mid % col]>target)
        {
            end=mid-1;
        }      
    }
    return false;
}

int main(){
    vector<vector<int>> v 
    {{1,3,5,7},
    {10,11,16,20},
    {23,30,34,60}};
    int target = 3;
    bool output = searchMatrix(v,target);
    printf("%d",output);
   return 0;
}

/*
OUTPUT 
(0 for true & 1 for false)
0
*/