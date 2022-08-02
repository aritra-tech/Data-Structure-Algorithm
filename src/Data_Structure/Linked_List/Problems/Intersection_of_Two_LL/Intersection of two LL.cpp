#Approach -1 (Length difference)

class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int length1=0,length2=0;
        ListNode* temp1=headA;
        ListNode*temp2=headB;
        while(temp1)
        {
            length1++;
            temp1=temp1->next;
        }
        while(temp2)
        {
            length2++;
            temp2=temp2->next;
        }
        temp1=headA;
        temp2=headB;
        while(temp1!=temp2)
        {
            if(length1>length2)
            {
                temp1=temp1->next;
                length1--;
            }
            else if(length2>length1)
            {
                temp2=temp2->next;
                length2--;
            }
            else
            {
               temp1=temp1->next;
               temp2=temp2->next; 
            }
            
        }
        return temp1;
    }
};



#Approach -2 (Using Two pointers )


class Solution {
public:
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        ListNode* temp1=headA;
        ListNode* temp2=headB;
        while(temp1!=temp2)
        {
            if(temp1==NULL)
            {
                temp1=headB;
            }
            else temp1=temp1->next;
            
            if(temp2==NULL)
            {
                temp2=headA;
            }
            else temp2=temp2->next;
        }
        return temp1;
    }
};