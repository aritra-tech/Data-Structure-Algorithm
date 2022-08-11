/* Approach

1. We have some given statements in the question.
2. Look upon the given statements and approach to the solution part.
3. We are given with the heads of two singly linked-lists headA and headB.
4. We have to return the node at which the two lists intersect.
5. We have to return null if the two linked lists have no intersection at all.
6. We have to follow the inputs to the judge as given in the question.
7. Following this, the judge will then create the linked structure based on those inputs and pass the two heads, headA and headB to our program.
8. If we correctly return the intersected node, then our solution will be accepted.

*/

/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */

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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {

        for(ListNode* pA = headA; pA; pA = pA->next)
            for(ListNode* pB = headB; pB; pB = pB->next)
                if(pA == pB)
                    return pA;
        return NULL;
    }
};

int main() {

    return 0;
}

// Time Complexity: O(m*n)
// Space Complexity: O(1)


