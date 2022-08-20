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

#include <bits/stdc++.h>
#include <iostream>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* swapPairs(ListNode* head) {

        ListNode* dummyHead = new ListNode(0);
        dummyHead->next = head;

        ListNode* p = dummyHead;
        while(p->next && p->next->next){
            ListNode* node1 = p->next;
            ListNode* node2 = node1->next;
            ListNode* next = node2->next;
            node2->next = node1;
            node1->next = next;
            p->next = node2;
            p = node1;
        }

        ListNode* retHead = dummyHead->next;
        delete dummyHead;

        return retHead;
    }
};

int main() {

    int arr[] = {1, 2, 3, 4};
    int n = sizeof(arr) / sizeof(int);

    ListNode* head = createLinkedList(arr, n);
    printLinkedList(head);

    head = Solution().swapPairs(head);
    printLinkedList(head);

    deleteLinkedList(head);

    return 0;
}

// Time Complexity: O(n)
// Space Complexity: O(1)
