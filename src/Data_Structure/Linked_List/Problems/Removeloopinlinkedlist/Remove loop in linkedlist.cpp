class Solution
{
public:
    void removeLoop(Node *head)
    {
        Node *slow = head;
        Node *fast = head;

        //Finding the point where the loop starts
        while (fast && fast->next)
        {
            slow = slow->next;
            fast = fast->next->next;
            if (slow == fast)
            {
                break;
            }
        }
        //if we got the loop then we'll move inside if condition
        if (slow == fast)
        {
            //starting slow from head and fast from the node where it was already
            slow = head; 
            if (slow == fast)
            {
                while (fast->next != slow)
                    fast = fast->next; // if slow and fast are already at same position suppose 1 then we have to reach the last position for making its next as NULL
            }
            else
            {
                while (slow->next != fast->next)
                {
                    slow = slow->next;
                    fast = fast->next;
                }
            }
            //removing the loop by making fast->next as NULL
            fast->next = 0;
        }
    }
};