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

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

// Brute Force
class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {

        if(head == NULL)
            return NULL;

        int len = get_len(head);
        k = k % len;

        ListNode* end = head;
        for(int i = 0 ; i < k ; i ++)
            end = end->next;

        ListNode* start = head;
        while(end->next != NULL){
            start = start->next;
            end = end->next;
        }

        end->next = head;
        head = start->next;
        start->next = NULL;

        return head;
    }

private:
    int get_len(ListNode* head){
        int res = 0;
        while(head){
            res ++;
            head = head->next;
        }
        return res;
    }
};


int main() {

    return 0;
}

// Time Complexity: O(N)
// Space Complexity: O(1)
