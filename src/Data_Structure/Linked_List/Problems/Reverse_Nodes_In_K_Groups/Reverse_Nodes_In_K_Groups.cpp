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
    ListNode* reverseKGroup(ListNode* head, int k) {
        
        // a single element is always sorted
        if(k == 1)
            return head;
        
        ListNode *temp = head;
        int length = 0;
        
        // calculating length of the linked list
        while(temp != NULL) {
            temp = temp -> next;
            length++;
        }
        
        ListNode *dummy = new ListNode();
        dummy -> next = head;
        
        ListNode *prev = dummy, *curr, *next;
        
        /* reversing k nodes everytime and linking the first
        node, to the first node of the next group of k elements */
        while(length >= k) {
            curr  = prev -> next;
            next = curr -> next;
            for(int i = 1; i < k; ++i) {
                curr -> next = next -> next;
                next -> next = prev -> next;
                prev -> next = next;
                next = curr -> next;
            }
            prev = curr;
            length -= k;
        }
        
        return dummy -> next;
    }
};

int main() {
    int k, n;
    ListNode *head = new ListNode(), *tail = head;

    cin >> k >> n;

    // creating a linked list
    for(int i = 0; i < n; ++i) {
        int temp;
        cin >> temp;
        tail -> next = new ListNode(temp);
        tail = tail -> next;
    }

    Solution s;
    ListNode *newHead = s.reverseKGroup(head -> next, k);

    // printing the updated linked list
    while(newHead != NULL) {
        cout << newHead -> val << " ";
        newHead = newHead -> next;
    }

    return 0;
}
