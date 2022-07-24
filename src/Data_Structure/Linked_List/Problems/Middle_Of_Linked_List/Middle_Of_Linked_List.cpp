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
    ListNode* middleNode(ListNode* head) {
        // when fast reaches NULL, slow is at middle node
        ListNode *slow = head, *fast = head;
        while(fast != NULL && fast -> next != NULL) {
            fast = fast -> next -> next;
            slow = slow -> next;
        }
        return slow;
    }
};

int main() {
    int n;
    ListNode *head = new ListNode(), *tail = head;

    cin >> n;

    // creating a linked list
    for(int i = 0; i < n; ++i) {
        int temp;
        cin >> temp;
        tail -> next = new ListNode(temp);
        tail = tail -> next;
    }

    Solution s;
    ListNode *mid = s.middleNode(head -> next);

    cout << mid -> val;

    return 0;
}
