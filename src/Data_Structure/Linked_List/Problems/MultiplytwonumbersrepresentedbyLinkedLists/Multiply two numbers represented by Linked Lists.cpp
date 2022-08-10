

long long multiplyTwoLists(Node *l1, Node *l2)
{
    // created 2 pointers ptr1 and ptr2 and assigned them l1 and l2 respectively
    Node *ptr1 = l1;
    Node *ptr2 = l2;
    //   created 2 variables to store the numbers of both linkedlist
    long long num1 = 0, num2 = 0, modu = 1000000007;

    //   while ptr will not reach NULL till then while loop will work
    while (ptr1)
    {
        /* Multiply the variable num1 with 10 and add node's value in it
            so for first node num1 will be 0 but from second node num1 will contain some value
        */
        num1 = (num1 * 10) % modu + ptr1->data;
        ptr1 = ptr1->next;
    }
    while (ptr2)
    {
        num2 = (num2 * 10) % modu + ptr2->data;
        ptr2 = ptr2->next;
    }
    // we have used % modu everywhere so that if the number is very large then it's remainder can be used by dividing it with modu
    return ((num1 % modu) * (num2 % modu)) % modu;
}