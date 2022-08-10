// We will use dummy node as the starting so if we have to remove the first element then we will keep dummy->next updated

class Solution
{
public:
    ListNode *removeElements(ListNode *head, int val)
    {
        if (!head)
            return head;
        ListNode *dummy = new ListNode(-1);
        dummy->next = head;
        ListNode *curr = dummy;

        while (curr && curr->next)
        {
            // if the value of curr->next equal to val then we will simply update the pointers
            if (curr->next->val == val)
            {
                curr->next=curr->next->next;
            }
            // otherwise will move curr ahead
            else
            {
                curr = curr->next;
            }
        }
        // dummy->next will contain the whole linkedlist as dummy->next was head
        return dummy->next;
    }
};