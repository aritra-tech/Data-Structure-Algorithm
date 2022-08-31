
class Solution {
public:
    // Middle of LL using slow & fast pointer approach
    ListNode* middle(ListNode *head)
    {
        ListNode* fast=head;
        ListNode* slow=head;
        while(fast && fast->next)
        {
            slow=slow->next;
            fast=fast->next->next;
        }
        return slow;
    }
    // Reverse of a LL
    ListNode* reverse(ListNode* head)
    {
        ListNode* temp=head;
        ListNode* curr=head;
        ListNode*prev=0;
        
        while(temp)
        {
            temp=temp->next;
            curr->next=prev;
            prev=curr;
            curr=temp;   
        }
        return prev;
    }
    bool isPalindrome(ListNode* head) {
        if(!head || !head->next) return true;
        ListNode *h1=head;
        // finding the middle element of the LL
        ListNode* mid=middle(h1);
        // the other LL which starts from slow , we'll reverse that LL
        ListNode* h2= reverse(mid);
        
        // Now we'll compare for the values of both the LL to find if it's a palindrome
        while(h1 && h2)
        {
            if(h1->val !=h2->val) return false;
            h1=h1->next;
            h2=h2->next;
        }
        return true;
    }
};

/*
Time Complexity:O(N)
Space Complexity:O(1) 
*/