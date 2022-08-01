#include <stdio.h>
#include <stdlib.h>
struct Element
{
    int i;
    int j;
    int x;
};
/*Sparse Matrix Struct consisting of 
m rows n cols and num will be no.
of non-0 elements  and then ele 
struct is consisting of row no. col no.
then element = x;
*/
struct Sparse
{
    int m;
    int n;
    int num;
    struct Element *ele;
};
void create(struct Sparse *s)
{
    int i;
    /*Taking col no.row no. no. of non-0 elements*/
    printf("Eneter Dimensions");
    scanf("%d%d", &s->m, &s->n);
    printf("Number of non-zero");
    scanf("%d", &s->num);
    /*Dynamic allocation of array of element struct*/
    s->ele = (struct Element *)malloc(s->num * sizeof(struct Element));
    printf("Eneter non-zero Elements");
    /*Storing non-0 element through iterating over the array*/
    for (i = 0; i < s->num; i++)
        scanf("%d%d%d", &s->ele[i].i, &s->ele[i].j, &s->ele[i].x);
}

void display(struct Sparse s)
{
    int i, j, k = 0;
    for (i = 0; i < s.m; i++)
    {
        /*Iterating over Sparse Matrix printing the element*/
        for (j = 0; j < s.n; j++)
        {
            if (i == s.ele[k].i && j == s.ele[k].j)
                printf("%d ", s.ele[k++].x);
            else
                printf("0 ");
        }
        printf("\n");
    }
}
int main()
{
    struct Sparse s;
    /*Creating the sparse matrix*/
    create(&s);
    /*Display the matrix*/
    display(s);
    return 0;
}