#include<iostream>
/*INCLUDING VECTOR HEADER FILE*/
#include<vector>
/*INCLUDING VECTOR ALGORITM FILE FOR REVERSE FUNCTION*/
#include<algorithm>
using namespace std;

vector<vector<int>> flipAndInvertImage(vector<vector<int>>& A) {
    /*ITERATING OVER 2-D Array*/
        for (int i= 0; i < A.size(); i++) {
            /*REVERSE EACH ARRAY IN 2D*/
            reverse(A[i].begin(), A[i].end());
            for (int j=0; j<A[i].size(); j++) {
            /* XOR GATE  MEANS 
                X  Y Result
                0  0  0
                0  1  1
                1  0  1
                1  1  1      
            */    
                A[i][j] ^= 0x1;
            }
        }
        return A;
}       

int main(){
    vector<vector<int>> A
    {
        {1,1,0,0},
        {1,0,0,1},
        {0,1,1,1},
        {1,0,1,0}
    };
    vector<vector<int>> result = flipAndInvertImage(A);
    /*ITERATING OVER 2-D ARRAY To DISPLAY THE ARRAY*/
    for (int i = 0; i < A.size(); i++)
    {
        for (int j = 0; j < A[i].size(); j++)
        {
            cout << A[i][j] << " ";
        }    
        cout << endl;
    }
}
