class Solution
{
public:
    ListNode *oddEvenList(ListNode *head)
    {
        if (!head || !head->next)
            return head;
        /* keep 4 pointers oddH and evenH are used for keeping the head of the both even LL and odd LL
        While evenT and oddT are used for storing other nodes and moving till last
        */
        ListNode *oddH = head; // storing first element of odd LL
        ListNode *oddT = NULL;
        ListNode *evenH = head->next; // storing first element of even LL
        ListNode *evenT = NULL;
        int count = 1;

        while (head != NULL)
        {
            // will keep checking the count and according to that we'll link the nodes in odd and even
            if (count % 2 == 0) // even
            {
                // if evenT is null initially then we'll just store head in it
                if (!evenT)
                    evenT = head;
                // otherwise we'll store head in evenT->next and will move forward
                else
                {
                    evenT->next = head;
                    evenT = evenT->next;
                }
            }
            else // odd
            {
                // if oddT is null initially then we'll just store head in it
                if (!oddT)
                    oddT = head;
                // otherwise we'll store head in oddT->next and will move forward
                else
                {
                    oddT->next = head;
                    oddT = oddT->next;
                }
            }
            head = head->next;
            count++;
        }
        // lastly link the oddT(tail or end of odd LL to head of even LL) to evenH
        oddT->next = evenH;
        // since evenT will be last node of LL thereby we'll put null in evenT next
        evenT->next = NULL;
        // since oddH is head of whole LL therefore we will return oddH
        return oddH;
    }
};

/*
Time Complexity:O(N)
Space Complexity:O(1) We're using only 4 pointers
*/