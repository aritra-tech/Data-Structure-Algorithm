# Reverse Nodes in k-Group

Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less tha:n or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 
Example 1:
![](https://assets.leetcode.com/uploads/2020/10/03/reverse_ex1.jpg)

```
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]
```

### C++ solution:
```
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:

    ListNode* reverse(ListNode* p0, ListNode* p_end)
    {
        /* reverse the inner elements (but not including)
         * between p0 and p_end 
         */
        if (p_end == p0 
            || p_end == p0->next 
            || p_end == p0->next->next
           ) 
            return p0;
        
        ListNode *p1, *p_next;
        
        p1 = p0->next;
        p_next = p1->next;
        
        while (p_next != p_end)
        {
            ListNode* cached_next = p_next->next;
            
            p_next->next = p1;
            p1 = p_next;
            p_next = cached_next;
        }
        
        ListNode* old_head = p0->next;
        p0->next = p1;
        old_head->next = p_end;
        
        return p0;
    }
    
    ListNode* reverseKGroup(ListNode* head, int k) {
        ListNode* dummy = new ListNode(0);
        dummy->next = head;
        
        ListNode *p1, *p2;
        p1 = dummy;
        p2 = dummy;
        
        /* initial incrementation */
        for (int i = 0; i <= k; i++)
        {
            if (p2)
            {
                p2 = p2->next;
            }
            else
            {
                /* not long enough to be reversed */
                return head;
            }
        }
        
        reverse(p1, p2);
        
        while (p2)
        {
            /* increment p1 & p2 */
            for (int i = 0; i < k; i++)
            {
                if (p2)
                {
                    p2 = p2->next;
                }
                else
                {
                    /* not long enough to be reversed */
                    return dummy->next;
                }
                
                p1 = p1->next;
            }
            
            reverse(p1, p2);
        }
        
        return dummy->next;
    }
};

```


## Java solution:

```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> st = new Stack<>();
        
        ListNode ansHead = new ListNode(-1);
        ListNode ans = ansHead;
        
        while(head != null){
            ListNode headNext = head.next;
            ListNode temp = head;
            
            //detaching the head
            head.next = null;
            
            head = headNext;
            
            st.push(temp);
            
            if(st.size() == k){
                while(st.size() > 0){
                    ans.next = st.pop();
                    ans = ans.next;
                }
            }
            
            
        }
        
        if(st.size() > 0){
            Stack<ListNode> st2 = new Stack<>();
            while(st.size() > 0){
                st2.push(st.pop());
            }
            
            while(st2.size() > 0){
                    ans.next = st2.pop();
                    ans = ans.next;
            }
        }
        
        return ansHead.next;
        
    }
}

```

[Problem link](https://leetcode.com/problems/reverse-nodes-in-k-group/)

