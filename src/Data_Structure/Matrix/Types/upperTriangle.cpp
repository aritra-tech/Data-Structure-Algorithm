#include <iostream>
using namespace std;

/*  
    We are creating struct for matrix
    for storing lower triangle elements
    in it form of 1D array 
*/

struct Matrix
{
    int *A;
    int n;
};

void Set(struct Matrix *m,int i,int j,int x)
{
    /* 
    if row <= col condition for upper triangle 
    we can store it an 1D array
     */
    if(i <= j)
        m->A[m -> n * (i - 1) + (i - 2)*(i - 1)/2 + j - i]= x;
}

int Get(struct Matrix m,int i,int j){
    /*
    Getting index of every element in 
    a 1D array which we are getting by
    taking the necc formula
    */
    if(i <= j)
        return m.A[m. n * (i - 1)+ (i - 2)*(i - 1)/2 + j - i];
    else
        return 0;
}


void Display(struct Matrix m){
    /*
    Iterating over the matrix 
    and printing every upper triangle element
    present in it
    */
    int i,j;
    for(i = 1 ; i <= m.n; i++)
    {
    for(j = 1;j <= m.n; j++)
    {
    if(i <= j)
        printf("%d ",m.A[m.n*(i - 1)+(i - 2)*(i - 1)/2+ j - i]);
    else
        printf("0 ");
    }
    printf("\n");
    } 
}
int main(){
    struct Matrix m;
    int i,j,x;
    printf("Enter Dimension");
    scanf("%d", &m.n);
    m.A = (int *)malloc(m.n * (m.n+1)/2 * sizeof(int));
    printf("Enter all elements");
    for(i = 1;i <= m.n;i++)
    {
        for(j = 1;j <= m.n;j++)
        {
            scanf("%d",&x);
            Set(&m,i,j,x);
        }
    }
    printf("\n\n");
    Display(m);
    return 0;
}

/*OUTPUT
Enter Dimension 4
Enter all elements 
1 1 1 1
0 1 1 1
0 0 1 1
0 0 0 1


1 1 1 1
0 1 1 1
0 0 1 1
0 0 0 1
*/