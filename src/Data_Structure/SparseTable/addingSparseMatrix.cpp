#include <iostream>
using namespace std;

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
    /*Taking col no.,row no. no. of non-0 elements*/
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
struct Sparse *add(Sparse *s1, Sparse *s2)
{
    struct Sparse *sum;
    int i, j, k;
    i = j = k = 0;
    if (s1->m != s2->m || s1->n != s2->n)
    {
        return NULL;
    }
    sum = new Sparse;
    /*When s1.m & s2.m are equal
    and similarly s2.n = s1.n 
    and making element array of 
    s1.num + s2.num*/ 
    sum->m = s1->m;
    sum->n = s2->n;
    sum->ele = new Element[s1->num + s2->num];
    while (i < s1->num && j < s2->num)
    {
        /*Either row or col is the smaller will be
        added to sum sum matrix*/
        if (s1->ele[i].i < s2->ele[j].i)
        {
            sum->ele[k++] = s1->ele[i++];
        }
        else if (s1->ele[i].i > s2->ele[j].i)
        {
            sum->ele[k++] = s2->ele[j++];
        }
        else
        {
            if (s1->ele[i].j < s2->ele[i].j)
            {
                sum->ele[k++] = s1->ele[i++];
            }
            else if (s1->ele[i].j > s2->ele[i].j)
            {
                sum->ele[k++] = s2->ele[j++];
            }
            else
            /*IF COL ROW ARE EQUAL WE WILL ADD 
            S1 & S2 at that position*/
            {
                sum->ele[k++] = s1->ele[i++];
                sum->ele[k++].x += s2->ele[j++].x;
            }   
        }
    }
    /*But if s1 or s2 ends we will add the
    reamining elements of either s1 o s2 
    to  sum */
    for (; i < sum->num; i++)
    {
  
        sum->ele[k++] = s1->ele[i];
    }
    for (; j < sum->num; j++)
    {
        sum->ele[k++] = s2->ele[j];
    }
    sum->m = s1->m;
    sum->n = s1->n;
    sum->num = k;
    return sum;
}
int main()
{
    struct Sparse s1, s2, *s3;
    create(&s1);
    create(&s2);
    /*Saving struct inside pointer
    s3 becoz it will modified*/
    s3 = add(&s1, &s2);
    printf("First Matrix: ");
    display(s1);
    printf("Second Matrix: ");
    display(s2);
    printf("Third Matrix:");
    display(*s3);
    return 0;
}
