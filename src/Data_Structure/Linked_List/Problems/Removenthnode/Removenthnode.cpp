class Solution {
public:
 ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *prev = nullptr,*curr = head,*start = nullptr;
        while(curr!=nullptr){
            n--;
            curr = curr->next;
            if(n<=0){
                if(start==nullptr){
                    start = head;
                }
                else{
                    prev = start;
                    start = start->next;
                }
            }
        }
        if(prev==nullptr){
            return start->next;
        }
        prev->next = start->next;
        return head;
    }
};