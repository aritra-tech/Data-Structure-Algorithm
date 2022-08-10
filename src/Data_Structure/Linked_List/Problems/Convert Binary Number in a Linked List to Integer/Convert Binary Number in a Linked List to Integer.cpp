Approach - 1

class Solution
{
public:
    int getDecimalValue(ListNode *head)
    {
        int length = 0;
        ListNode *temp = head;
        // find the length of the linkedlist
        while (temp)
        {
            length++;
            temp = temp->next;
        }
        // to use the same temp pointer move it to head (you can make a another pointer also)
        temp = head;
        int sum = 0;
        while (temp)
        {
            /* if temp->val is 1 then only move inside the condition because multiplying 0 with anything will be 0 only
            so we are multiplying it like if length is 3 then
            sum+=  1 * 2^2 ==> sum=4 
                */
            if (temp->val != 0) sum += 1 * pow(2, length - 1);
            temp = temp->next;
            length--;
        }
        return sum;
    }
};



/*
Approach-2

It's a simple maths approach in which just multiply the sum with 2 and keep adding head->val and assign it to sum , keep moving head until it becomes NULL

*/
class Solution
{
public:
    int getDecimalValue(ListNode *head)
    {
        int sum = 0;
        while (head)
        {
            sum = 2 * sum + head->val;
            head = head->next;
        }
        return sum;
    }
};