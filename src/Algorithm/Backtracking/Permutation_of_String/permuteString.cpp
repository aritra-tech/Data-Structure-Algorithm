#include <bits/stdc++.h> 
using namespace std; 



void Permute(string a, int left, int right) 
{ 
    // Base case 
    if (left == right) 
        cout<<"("+ a +")"<<endl; 
    else
    { 
        //Iterating over the different permutations   
        for (int i = left; i <= right; i++) 
        { 
            /*
            As you can refer to pic how swaping is ocuuring for eg
            swap(a[0],a[0]) means A swap with A with itself(Means A is fixed and
            will iterate over remaining possibilties) only
            then we are adding left++ by calling the function whithin 
            the function and go when low == high it will print the strings 
            */   
            swap(a[left], a[i]); 
            // Recursion called 
            Permute(a, left + 1, right); 
            //Backtracking going to over [A | B | C | \0] then going over the loop again
            swap(a[left], a[i]); 
        } 
    } 
} 

// Driver Code 
int main() 
{ 
    string str = "ABC"; 
    int n = str.size(); 
    Permute(str, 0, n-1); 
    return 0; 
} 

/*
OUTPUT
 (ABC)
 (ACB)
 (BAC)
 (BCA)
 (CBA)
 (CAB)
 */