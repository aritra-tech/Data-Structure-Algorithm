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

#include <iostream>
using namespace std;

/// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

// Take Two Pointers to Reverse and Traverse
class Solution {
public:
    bool isPalindrome(ListNode* head) {

        if(head == NULL || head->next == NULL)
            return true;

        ListNode* slow = head;
        ListNode* fast = head;
        while(fast->next != NULL && fast->next->next != NULL){
            slow = slow->next;
            fast = fast->next->next;
        }

        slow->next = reverse(slow->next);

        slow = slow->next;
        ListNode* cur = head;
        while(slow != NULL){
            if(cur->val != slow->val)
                return false;
            else{
                slow = slow->next;
                cur = cur->next;
            }
        }
        return true;
    }

private:
    ListNode* reverse(ListNode* head){

        if(head == NULL || head->next == NULL)
            return head;

        ListNode* pre = head;
        ListNode* cur = head->next;
        ListNode* next = cur->next;
        head->next = NULL;

        while(true){
            cur->next = pre;
            pre = cur;
            cur = next;
            if(cur == NULL)
                break;
            next = cur->next;
        }

        return pre;
    }
};

int main() {

    return 0;
}