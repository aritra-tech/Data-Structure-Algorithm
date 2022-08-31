#include<iostream>
#include<vector>  
#include<bits/stdc++.h>
using namespace std;

vector<int> kWeakestRows(vector<vector<int>>& mat, int k) {
    /* Pair array consisting of sum of row and location of row number*/
    vector<pair<int,int>>v;
    int sum = 0;
    for(int i = 0;i < mat.size();i++){
        sum = 0;
        for(int j=0;j<mat[i].size();j++)
        /* Sum  of the elements in the matrix */
            sum += mat[i][j];
        /*Pushing back thr sum and the element row number 
        pushing into the pair */    
        v.push_back({sum,i});
    }
    /*Now sorting accoding to row number*/
    sort(v.begin(),v.end());
    vector<int> s;
    for(int i=0;i<v.size();i++)
    /*Now only pushing the row number*/
        s.push_back(v[i].second);
        /*Outputing vector array till kth element*/
    return vector<int>(s.begin(),s.begin()+k);
} 

int main(){
    vector<vector<int>> v {{1,1,0,0,0},
 {1,1,1,1,0},
 {1,0,0,0,0},
 {1,1,0,0,0},
 {1,1,1,1,1}}; 
   int k = 3;  
   vector<int> output ;
   output = kWeakestRows(v,k);
   printf("%d",output);
    return 0;
}

/*
OUTPUT
[2,3,0]
*/