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

#include <iostream>
using namespace std;

/// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {

        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode* dummyHead = new ListNode(-1), *cur = dummyHead;
        int carry = 0;
        for(ListNode* node1 = l1, *node2 = l2; node1 || node2 || carry;
            node1 = node1 ? node1->next : NULL, node2 = node2 ? node2->next : NULL){

            int x = node1 ? node1->val : 0;
            x += node2 ? node2->val : 0;
            x += carry;
            cur->next = new ListNode(x % 10);
            cur = cur->next;
            carry = x / 10;
        }
        return reverse(dummyHead->next);
    }

private:
    ListNode* reverse(ListNode* node){

        if(!node->next) return node;

        ListNode* ret = reverse(node->next);
        node->next->next = node;
        node->next = NULL;
        return ret;
    }
};


int main() {

    return 0;
}

// Time Complexity: O(m + n + max(m, n))
// Space Complexity: O(1)
