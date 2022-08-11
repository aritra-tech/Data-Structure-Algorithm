/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with the head of a linked list.
4. We have to look that there is a cycle in a linked list if there is some node in the list.
5. The cycle can be reached again by continuously following the next pointer.
6. Put the condition that if head == null and head->next == null then return null.
7. The pos is used to denote the index of the node that tail's next pointer is connected to which is 0-indexed.
8. If there is no cycle then it is -1.
9. Finally if there is no cycle, return null.

*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

#include <bits/stdc++.h>
#include <iostream>
using namespace std;


// Definition for singly-linked list.
struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode *detectCycle(ListNode *head) {

        if(head == NULL || head->next == NULL)
            return NULL;

        set<ListNode*> records;
        ListNode* curNode = head;
        while(curNode != NULL){
            if(records.find(curNode) != records.end())
                return curNode;

            records.insert(curNode);
            curNode = curNode->next;
        }

        return NULL;
    }
};

ListNode* createLinkedList(int arr[], int n){

    if( n == 0 )
        return NULL;

    ListNode* head = new ListNode(arr[0]);
    ListNode* curNode = head;
    for( int i = 1 ; i < n ; i ++ ){
        curNode->next = new ListNode(arr[i]);
        curNode = curNode->next;
    }

    return head;
}

ListNode* tail(ListNode* head){

    if(head == NULL)
        return NULL;

    ListNode* curNode = head;
    while(curNode->next != NULL)
        curNode = curNode->next;

    return curNode;
}

void deleteLinkedList(ListNode* head){

    ListNode* curNode = head;
    while( curNode != NULL ){
        ListNode* delNode = curNode;
        curNode = curNode->next;
        delete delNode;
    }

    return;
}

int main() {

    int n1 = 2;
    int nums1[2] = {1, 2};
    ListNode* head1 = createLinkedList(nums1, n1);

    ListNode* entrance1 = Solution().detectCycle(head1);
    if(entrance1 != NULL)
        cout << "Loop entrance at " << entrance1->val << endl;
    else
        cout << "No Loop" << endl;

    deleteLinkedList(head1);

    int n2 = 2;
    int nums2[2] = {1, 2};
    ListNode* head2 = createLinkedList(nums2, n2);
    ListNode* tail2 = tail(head2);
    tail2->next = head2;

    ListNode* entrance2 = Solution().detectCycle(head2);
    if(entrance2)
        cout << "Loop entrance at " << entrance2->val << endl;
    else
        cout << "No Loop" << endl;

    tail2->next = NULL;
    deleteLinkedList(head2);

    return 0;
}

// Time Complexity: O(N)
// Space Complexity: O(N)

