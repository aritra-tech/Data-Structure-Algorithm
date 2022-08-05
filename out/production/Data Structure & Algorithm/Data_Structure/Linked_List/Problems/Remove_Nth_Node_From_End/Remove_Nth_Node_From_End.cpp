#include <iostream>

using namespace std;

class ListNode {
public:
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {

        ListNode *start = new ListNode(0, head);
        ListNode *temp1 = start, *temp2 = start;

        while(n--) {
            temp2 = temp2 -> next;
        }
        
        // when temp2 reaches NULL, temp1 will point to the node to be deleted 

        while(temp2 -> next != NULL) {
            temp1 = temp1 -> next;
            temp2 = temp2 -> next;
        }
        
        // unlinking the node to be deleted
        temp1 -> next = temp1 -> next -> next;
        
        return start -> next;
    }
};

int main() {
    int m, n;
    ListNode *head = new ListNode(), *tail = head;

    cin >> m >> n;

    // creating a linked list
    for(int i = 0; i < m; ++i) {
        int temp;
        cin >> temp;
        tail -> next = new ListNode(temp);
        tail = tail -> next;
    }

    Solution s;
    ListNode *newHead = s.removeNthFromEnd(head -> next, n);

    // printing the updated linked list
    while(newHead != NULL) {
        cout << newHead -> val << " ";
        newHead = newHead -> next;
    }

    return 0;
}
