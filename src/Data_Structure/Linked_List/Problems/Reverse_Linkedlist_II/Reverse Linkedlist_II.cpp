class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int left, int right) {

        ListNode* dummy=new ListNode(0);
        dummy->next=head;
        ListNode* prev=dummy;
        ListNode* tail;
        ListNode* temp;

        //if there is no head or the position to be reversed is same then we'll directly return head
        if(!head || right==left) return head;

        int count=right-left; //storing right-left

        //with the help of for loop prev pointer will reach to the left position
        for(int i=0;i<left-1;i++)
        {
            prev=prev->next;
        }
        //and tail will be just one position behind prev
        tail=prev->next;

        /*
         Connecting the nodes here 
         it will reverse in a order like 
         Ques:      1 -> 2 -> 3 -> 4 -> 5  left=2 right=4 
                    |    |         |
                   prev  left,tail  right
                   So it will reverse like
               
                1 -> 3-> 2-> 4-> 5
        then    1 -> 4-> 3-> 2-> 5
        */
        while(count--)
        {
            temp=prev->next;
            prev->next=tail->next;
            tail->next=tail->next->next;
            prev->next->next=temp;
        }

        return dummy->next;
        
    }
};