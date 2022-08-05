#include <iostream>
using namespace std;
/*
    We are creating struct for matrix
    for storing diagonal elements
    in it form of 1D array
*/
struct Matrix
{
    int A[10];
    int n;
};
void Set(struct Matrix *m,int i,int j,int x)
{
    /* if row == col condition for main diagonal 
    we can store it an 1D array */  
    if(i == j)
        m -> A[i-1] = x;

}
int Get(struct Matrix m,int i,int j)
{
    /* Iterating over Matrix 
    & printing each element inside it */ 
    if(i==j)
        return m.A[i-1];
    else
        return 0;
}

void Display(struct Matrix m)
{
    /* Iterating over Matrix 
     & printing each element inside it */ 
    int i,j;
    for(i=0;i<m.n;i++)
    {
        for(j=0;j<m.n;j++)
        {
            if(i==j)
                printf("%d ",m.A[i]);
            else
                printf("0 ");
        }
        printf("\n");
    }
}

int main()
{
    struct Matrix m;
    m.n=4;
    Set(&m,1,1,5);
    Set(&m,2,2,8);
    Set(&m,3,3,9);
    Set(&m,4,4,12);
    printf("%d \n",Get(m,2,2));
    Display(m);
    return 0;
}
/*OUTPUT
  8 
  5 0 0 0
  0 8 0 0
  0 0 9 0
  0 0 0 12
*/