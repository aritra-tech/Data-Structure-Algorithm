/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with the head of a linked list.
4. Reverse the nodes of the list k at a time.
5. Here k is a positive integer and is less than or equal to the length of the linked list.
6. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.
7. We have to or may not alter the values in the list's nodes.
8. Look that only nodes themselves may be changed.
9. Look at the constraints Constraints given:
   a. The number of nodes in the list is n.
   b. 1 <= k <= n <= 5000
   c. 0 <= Node.val <= 1000
10. Finally return the modified list.

*/

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

/// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* reverseKGroup(ListNode* head, int k) {

        ListNode* dummyHead = new ListNode(-1);
        dummyHead->next = head;

        ListNode* cur = dummyHead;
        while(cur && cur->next){
            ListNode* tail = cur->next;

            ListNode* left;
            bool ok = false;
            cur->next = reverse(cur->next, k - 1, left, ok);
            tail->next = left;

            if(ok)
                cur = tail;
            else {
                tail = cur->next;
                cur->next = reverse(cur->next, k - 1, left, ok);
                tail->next = NULL;
                break;
            }
        }

        ListNode* ret = dummyHead->next;
        delete dummyHead;
        return ret;
    }

private:
    ListNode* reverse(ListNode* head, int index, ListNode* &left, bool& ok){

        if(index == 0 || !head->next){
            ok = index == 0;
            left = head->next;
            return head;
        }

        ListNode* tail = head->next;
        ListNode* ret = reverse(head->next, index - 1, left, ok);
        tail->next = head;
        return ret;
    }
};

ListNode* createLinkedList(const vector<int>& arr){

    if(arr.size() == 0)
        return NULL;

    ListNode* head = new ListNode(arr[0]);
    ListNode* curNode = head;
    for(int i = 1 ; i < arr.size() ; i ++){
        curNode->next = new ListNode(arr[i]);
        curNode = curNode->next;
    }

    return head;
}

void printLinkedList(ListNode* head){

    ListNode* curNode = head;
    while(curNode != NULL){
        cout << curNode->val << " -> ";
        curNode = curNode->next;
    }

    cout << "NULL" << endl;

    return;
}

void deleteLinkedList(ListNode* head){

    ListNode* curNode = head;
    while(curNode != NULL){
        ListNode* delNode = curNode;
        curNode = curNode->next;
        delete delNode;
    }

    return;
}


int main() {

    vector<int> arr1 = {1, 2, 3, 4, 5};
    ListNode* res1 = Solution().reverseKGroup(createLinkedList(arr1), 3);
    printLinkedList(res1);
    deleteLinkedList(res1);

    return 0;
}

// Time Complexity: O(n)
// Space Complexity: O(k)
